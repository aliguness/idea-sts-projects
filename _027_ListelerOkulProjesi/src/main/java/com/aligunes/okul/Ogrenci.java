package com.aligunes.okul;

import lombok.*;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogrenci {

    String ad;

    String soyad;
    String adres;
    String okulNo;

    List<String> dersListesi;
}
