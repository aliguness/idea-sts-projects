package com.aligunes.repository;

import com.aligunes.repository.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAuthRepository extends JpaRepository<Auth, Long> {

    // Hazır bulunmayan method'ları buraya yazıyoruz.

    Optional<Auth> findOptinalByUsernameAndPassword(String username, String password);
}
