package com.aligunes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserProfileServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(UserProfileServiceApp.class);
    }
}