package com.aligunes.repository;


import com.aligunes.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository <User,Long> {


    //"select*from User as u where u.email=?1 and u.password=?2"
    Optional<User> findByEmailAndPassword(String email, String password);

// userService'de bunu kullanacagız.


}