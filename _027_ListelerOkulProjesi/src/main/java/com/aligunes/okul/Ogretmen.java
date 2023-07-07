package com.aligunes.okul;

import com.aligunes.utils.Branslar;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogretmen {

   private Branslar brans;

    private String ad;
    private String soyad;
    private String telefon;
    private String adres;
}
