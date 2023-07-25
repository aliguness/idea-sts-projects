package com.aligunes.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Kisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ad;
    private String soyad;
    private String tcNo;

    @ToString.Exclude // istersen koyabilirsin. Consola çıktı olarak yazdırmak için yararlanılır.
    @OneToMany(mappedBy = "kisi",fetch =FetchType.LAZY, cascade = CascadeType.ALL) //kiralama sınıfında kisi diye bir şey olusturucaz demektir.
    private List<Kiralama> kiralamaList;

}
