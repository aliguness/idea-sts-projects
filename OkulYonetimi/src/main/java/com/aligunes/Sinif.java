package com.aligunes;

import java.util.ArrayList;
import java.util.List;

public class Sinif {


    private  ESinif sinifSeviyesi;
    private Ogretmen ogretmen;
    private List<Ogrenci> ogrenciList;

    public Sinif(ESinif sinifSeviyesi, Ogretmen ogretmen) {
        this.sinifSeviyesi = sinifSeviyesi;
        this.ogretmen = ogretmen;
        this.ogrenciList = new ArrayList<>();
    }

    public ESinif getSinifSeviyesi() {
        return sinifSeviyesi;
    }

    public void setSinifSeviyesi(ESinif sinifSeviyesi) {
        this.sinifSeviyesi = sinifSeviyesi;
    }

    public Ogretmen getOgretmen() {
        return ogretmen;
    }

    public void setOgretmen(Ogretmen ogretmen) {
        this.ogretmen = ogretmen;
    }

    public List<Ogrenci> getOgrenciList() {
        return ogrenciList;
    }

    public void setOgrenciList(List<Ogrenci> ogrenciList) {
        this.ogrenciList = ogrenciList;
    }

    @Override
    public String toString() {
        return "Sinif{" +
                "sinifSeviyesi=" + sinifSeviyesi +
                ", ogretmen=" + ogretmen +
                ", ogrenciList=" + ogrenciList +
                '}';
    }
}
