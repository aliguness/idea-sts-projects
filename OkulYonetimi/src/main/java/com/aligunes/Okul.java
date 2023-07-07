package com.aligunes;

import java.util.ArrayList;
import java.util.List;

public class Okul {
    private String isim;
    private List<Ogretmen> ogretmenList;
    private List<Ogrenci> ogrenciList;
    private List<Memur> memurList;
    private List<Sinif> sinifList;
    private List<EDers> dersList;


    public Okul(String isim) {
        this.isim = isim;
        this.dersList = new ArrayList<>();
        this.memurList = new ArrayList<>();
        this.ogrenciList = new ArrayList<>();
        this.sinifList = new ArrayList<>();
        this.ogretmenList = new ArrayList<>();

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public List<Ogretmen> getOgretmenList() {
        return ogretmenList;
    }

    public void setOgretmenList(List<Ogretmen> ogretmenList) {
        this.ogretmenList = ogretmenList;
    }

    public List<Ogrenci> getOgrenciList() {
        return ogrenciList;
    }

    public void setOgrenciList(List<Ogrenci> ogrenciList) {
        this.ogrenciList = ogrenciList;
    }

    public List<Memur> getMemurList() {
        return memurList;
    }

    public void setMemurList(List<Memur> memurList) {
        this.memurList = memurList;
    }

    public List<Sinif> getSinifList() {
        return sinifList;
    }

    public void setSinifList(List<Sinif> sinifList) {
        this.sinifList = sinifList;
    }

    public List<EDers> getDersList() {
        return dersList;
    }

    public void setDersList(List<EDers> dersList) {
        this.dersList = dersList;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "isim='" + isim + '\'' +
                ", ogretmenList=" + ogretmenList +
                ", ogrenciList=" + ogrenciList +
                ", memurList=" + memurList +
                ", sinifList=" + sinifList +
                ", dersList=" + dersList +
                '}';
    }
}
