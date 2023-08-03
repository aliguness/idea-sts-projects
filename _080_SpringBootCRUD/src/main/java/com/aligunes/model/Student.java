package com.aligunes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    //@GeneratedValue(strategy = GenerationType.UUID)
    //private String id;
    private String firstName;
    private String lastName;
    private String email;
}
