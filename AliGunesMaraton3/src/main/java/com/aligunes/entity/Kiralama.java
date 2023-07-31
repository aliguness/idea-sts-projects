package com.aligunes.entity;

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
public class Kiralama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Kisi kisi; // Bir kişi birden fazla kiralama yapabilir.

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Arac arac;
}
