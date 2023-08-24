package com.aligunes.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")


/*
Kullanıcı (User):
• Kullanıcı kimlik bilgilerini (ad, soyad, e-posta, şifre vb.) içeren kullanıcıları temsil eder.
• Kullanıcının birden çok yazısı olabilir.

"id", "first_name", "last_name", "email" ve "password"
 */

public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @ElementCollection  // hibernate üzerinden degil Idler üzerinden ilişki
    private Set<Long> favPosts;
    @ElementCollection
    private Set<Long> comments;
}
