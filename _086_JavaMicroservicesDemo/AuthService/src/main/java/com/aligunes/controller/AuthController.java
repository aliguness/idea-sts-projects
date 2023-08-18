package com.aligunes.controller;

import com.aligunes.constant.EndPoints;
import com.aligunes.dto.request.RegisterRequestDto;
import com.aligunes.repository.entity.Auth;
import com.aligunes.service.AuthService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(EndPoints.AUTH)
public class AuthController {

    private final AuthService authService;

    @PostMapping(EndPoints.REGISTER)
    public ResponseEntity<Auth> register(@RequestBody RegisterRequestDto dto){
      /*
        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());
        auth.setEmail(dto.getEmail());
        auth.setPassword(dto.getPassword());
        authService.save(auth);
        */

        Auth auth = authService.save(
                Auth.builder()
                        .username(dto.getUsername())
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                        .build()
        );

        return ResponseEntity.ok(auth);
    }


}