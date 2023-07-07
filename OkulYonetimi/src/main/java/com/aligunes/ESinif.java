package com.aligunes;

import java.util.ArrayList;
import java.util.List;

public enum ESinif {
    SINIF1(new ArrayList<EDers>(List.of(EDers.TURKCE,EDers.MATEMATIK,EDers.HAYAT_BILGISI,EDers.GORSEL_SANATLAR,EDers.MUZIK,
            EDers.BEDEN,EDers.SERBEST_ETKINLIK))),
    SINIF2(new ArrayList<EDers>(List.of(EDers.TURKCE,EDers.MATEMATIK,EDers.HAYAT_BILGISI,EDers.YABANCI_DIL ,
            EDers.GORSEL_SANATLAR,EDers.MUZIK,EDers.BEDEN,EDers.SERBEST_ETKINLIK))),
    SINIF3(new ArrayList<EDers>(List.of(EDers.TURKCE,EDers.MATEMATIK,EDers.HAYAT_BILGISI,EDers.FEN_BILIMLERI,
            EDers.YABANCI_DIL ,EDers.GORSEL_SANATLAR,EDers.MUZIK,EDers.BEDEN,EDers.SERBEST_ETKINLIK))),
    SINIF4(new ArrayList<EDers>(List.of(EDers.TURKCE,EDers.MATEMATIK,EDers.FEN_BILIMLERI,EDers.SOSYAL_BILGILER,
            EDers.YABANCI_DIL ,EDers.GORSEL_SANATLAR,EDers.DIN,EDers.MUZIK,EDers.BEDEN,
            EDers.SERBEST_ETKINLIK,EDers.INSAN_HAKLARI))),
    SINIF5(new ArrayList<EDers>(List.of(EDers.TURKCE,EDers.MATEMATIK,EDers.FEN_BILIMLERI,EDers.SOSYAL_BILGILER,
            EDers.YABANCI_DIL ,EDers.GORSEL_SANATLAR,EDers.DIN,EDers.MUZIK,EDers.BEDEN,
            EDers.BILISIM_TEKNOLOJILERI))),
    SINIF6(new ArrayList<EDers>(List.of(EDers.TURKCE,EDers.MATEMATIK,EDers.FEN_BILIMLERI,EDers.SOSYAL_BILGILER,
            EDers.YABANCI_DIL ,EDers.GORSEL_SANATLAR,EDers.DIN,EDers.MUZIK,EDers.BEDEN,
            EDers.BILISIM_TEKNOLOJILERI))),
    SINIF7(new ArrayList<EDers>(List.of(EDers.TURKCE,EDers.MATEMATIK,EDers.FEN_BILIMLERI,EDers.SOSYAL_BILGILER,
            EDers.YABANCI_DIL ,EDers.GORSEL_SANATLAR,EDers.DIN,EDers.MUZIK,EDers.BEDEN,
            EDers.TEKNOLOJI_TASARIM))),
    SINIF8(new ArrayList<EDers>(List.of(EDers.TURKCE,EDers.MATEMATIK,EDers.INKILAP_TARIHI_VE_ATATURKCULUK ,
            EDers.FEN_BILIMLERI,EDers.YABANCI_DIL ,EDers.GORSEL_SANATLAR,EDers.DIN,EDers.MUZIK,
            EDers.BEDEN,EDers.TEKNOLOJI_TASARIM,EDers.REHBERLIK)));

    List<EDers> dersler;


    ESinif(ArrayList<EDers> list) {
         dersler= list;

    }

    public List<EDers> getLessons() {
        return dersler;
    }

    public void setLessons(List<EDers> lessons) {
        this.dersler = lessons;
    }
}
