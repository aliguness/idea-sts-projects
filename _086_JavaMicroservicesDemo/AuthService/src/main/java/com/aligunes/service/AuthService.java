package com.aligunes.service;

import com.aligunes.dto.request.DoLoginRequestDto;
import com.aligunes.dto.request.DoRegisterRequestDto;
import com.aligunes.exception.AuthServiceException;
import com.aligunes.exception.ErrorType;
import com.aligunes.mapper.IAuthMapper;
import com.aligunes.repository.IAuthRepository;
import com.aligunes.repository.entity.Auth;
import com.aligunes.utility.JwtTokenManager;
import com.aligunes.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthService extends ServiceManager <Auth, Long> {

    private final IAuthRepository repository;

    private final JwtTokenManager jwtTokenManager;



    public AuthService(IAuthRepository repository, JwtTokenManager jwtTokenManager) {
        super(repository);
        this.repository = repository;
        this.jwtTokenManager = jwtTokenManager;
    }

    public String doLogin(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        if(auth.isEmpty())
            throw new AuthServiceException(ErrorType.LOGIN_USERNAME_OR_PASSWORD_NOT_EXISTS);

        // return    auth.get().getId().toString();
        return  jwtTokenManager.createToken(auth.get().getId()).get();
    }

    public Auth doRegister(DoRegisterRequestDto dto) {

        Auth auth = IAuthMapper.INSTANCE.toAuth(dto);
        auth.setCreateAt(System.currentTimeMillis());
        auth.setState(true);
        save(auth);
        return auth;
    }

    // Tokensiz
/*
    public List<Auth> findAll() {
        return repository.findAll();
    }
    */


    public List<Auth> findAll(String token) {

        Optional<Long> id = null;

        try {
            id = jwtTokenManager.getIdFromToken(token);
            System.out.println("ID: "+ id);
        }catch (Exception e){
            throw new AuthServiceException(ErrorType.INVALID_TOKEN);
        }


        if (findById(id.get()).isEmpty()){
            throw new AuthServiceException(ErrorType.INVALID_TOKEN); // FIXME
        }


        return repository.findAll();
    }

}