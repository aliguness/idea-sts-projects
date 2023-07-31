package com.aligunes.entity;

import com.aligunes.entity.enums.EArabaStatus;
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
public class Arac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "marka")
    private String marka;
    @Column(name = "model")
    private String model;

    @Builder.Default
    @Enumerated(EnumType.STRING) // enum ordinal dönecegi icin string'e cevirdik.
    private EArabaStatus durum = EArabaStatus.MUSAIT;

}
