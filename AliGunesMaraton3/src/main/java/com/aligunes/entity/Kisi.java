package com.aligunes.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity //databse class'ı oldugu icin Id istendi.
public class Kisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ad;
    private String soyad;


    @ToString.Exclude // Liste olduğu için toString hatası almamak için bu anatationu kullandım.
    @OneToMany(mappedBy = "kisi", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Kiralama> kiralamaList;


}
