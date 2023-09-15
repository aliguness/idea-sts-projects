package com.aligunes.service;

import com.aligunes.dto.request.ActiveRequestDto;
import com.aligunes.dto.request.LoginRequestDto;
import com.aligunes.dto.request.RegisterRequestDto;
import com.aligunes.dto.response.RegisterResponseDto;
import com.aligunes.exception.AuthManagerException;
import com.aligunes.exception.ErrorType;
import com.aligunes.mapper.IAuthMapper;
import com.aligunes.repository.IAuthRepository;
import com.aligunes.repository.entity.Auth;
import com.aligunes.repository.enums.EStatus;
import com.aligunes.utility.CodeGenarator;
import com.aligunes.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService extends ServiceManager<Auth, Long> {

    private final IAuthRepository authRepository;

    public AuthService(IAuthRepository authRepository) {
        super(authRepository);
        this.authRepository = authRepository;
    }

    public RegisterResponseDto register(RegisterRequestDto dto){  //Response: karşımızdakine gosterdigimiz bilgiler - Request:karşı taraftan aldıgımız veri.
        Auth auth = IAuthMapper.INSTANCE.toAuth(dto);
        auth.setActivationCode(CodeGenarator.genarateCode());
        save(auth);
        RegisterResponseDto responseDto=IAuthMapper.INSTANCE.toRegisterResponseDto(auth);
        return responseDto;

//        Auth auth=new Auth();
//        auth.setUsername(dto.getUsername());
//        auth.setEmail(dto.getEmail());
//        auth.setPassword(dto.getPassword());
//        auth.setActivationCode(CodeGenarator.genarateCode());
//        save(auth); // 2 saveden biri tercih edilir.
//        authRepository.save(auth);
    }

    public Boolean login(LoginRequestDto dto){

        Optional<Auth> optionalAuth= authRepository.findOptinalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
                if (optionalAuth.isEmpty()){
                    throw new AuthManagerException(ErrorType.USER_NOT_FOUND);
                }if (!optionalAuth.get().getStatus().equals(EStatus.ACTIVE)){
                    throw new AuthManagerException(ErrorType.ACCOUNT_NOT_ACTIVE);
                }
                return true;
    }

    public Boolean activateStatus(ActiveRequestDto dto){
     //
        Optional<Auth> optionalAuth = findById(dto.getId());

        if (optionalAuth.isEmpty()){
            throw new AuthManagerException(ErrorType.USER_NOT_FOUND);
        }
        if (optionalAuth.get().getStatus().equals(EStatus.ACTIVE)){
            throw new AuthManagerException(ErrorType.ALREADY_ACTIVE); //RuntimeException("Hesabınız zaten aktif durumdadır. "); eski hali. exception paketinden sonra düzenlendik hatalar tanıtıldı.
        }
        if (dto.getActivationCode().equals(optionalAuth.get().getActivationCode())){
            optionalAuth.get().setStatus(EStatus.ACTIVE);
            update(optionalAuth.get());
            return true;
        }else {
            throw new AuthManagerException(ErrorType.INVALID_CODE);
        }
    }

}
