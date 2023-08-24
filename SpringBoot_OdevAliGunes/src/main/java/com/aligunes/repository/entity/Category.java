package com.aligunes.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "categories")


/*
 Yazıların kategorilerini temsil eder.
• Kategorinin adı ve açıklaması gibi bilgiler içerir
, "id", "name" ve "description"

 */
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
