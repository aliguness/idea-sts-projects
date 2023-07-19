package com.aligunes.model_entity;

import javax.persistence.*;

@Entity
@Table(name = "TEACHER")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //UUID?
    @Column (name = "TEACHER_ID")
    private String id;

    private String firstname;
}
