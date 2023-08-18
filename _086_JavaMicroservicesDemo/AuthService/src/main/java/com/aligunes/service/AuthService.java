package com.aligunes.service;


import com.aligunes.dto.request.DoLoginRequestDto;
import com.aligunes.dto.request.DoRegisterRequestDto;
import com.aligunes.exception.AuthServiceException;
import com.aligunes.exception.ErrorType;
import com.aligunes.mapper.IAuthMapper;
import com.aligunes.repository.IAuthRepository;
import com.aligunes.repository.entity.Auth;
import com.aligunes.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService extends ServiceManager <Auth, Long> {

    private final IAuthRepository repository;

    public AuthService(IAuthRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public String doLogin(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        if(auth.isEmpty())
            throw new AuthServiceException(ErrorType.LOGIN_USERNAME_OR_PASSWORD_NOT_EXISTS);

        return auth.get().getId().toString();
    }

    public Auth doRegister(DoRegisterRequestDto dto) {

        Auth auth = IAuthMapper.INSTANCE.toAuth(dto);
        save(auth);
        return auth;
    }
}