package com.aligunes.service;


import com.aligunes.repository.IAuthRepository;
import com.aligunes.repository.entity.Auth;
import com.aligunes.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class AuthService extends ServiceManager <Auth, Long> {

    private final IAuthRepository repository;

    public AuthService(IAuthRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
