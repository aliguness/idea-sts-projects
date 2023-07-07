package com.aligunes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ogrenci extends Kisi{
    private String numara;
    private static int numaraSayar =1;
    private ESinif sinifi;
    private List<Double> notes;
    private Map<EDers, List<Double>> derseGoreNotlar;


    public Ogrenci(String isim, String soyisim, ESinif sinifi) {
        super(isim, soyisim);
        this.sinifi = sinifi;
        this.numara ="S-" + numaraSayar++;
        this.notes = new ArrayList<>();
        this.derseGoreNotlar = new HashMap<>();

    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public ESinif getSinifi() {
        return sinifi;
    }

    public void setSinifi(ESinif sinifi) {
        this.sinifi = sinifi;
    }

    public List<Double> getNotes() {
        return notes;
    }

    public void setNotes(List<Double> notes) {
        this.notes = notes;
    }

    public Map<EDers, List<Double>> getDerseGoreNotlar() {
        return derseGoreNotlar;
    }

    public void setDerseGoreNotlar(Map<EDers, List<Double>> derseGoreNotlar) {
        this.derseGoreNotlar = derseGoreNotlar;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "numara='" + numara + '\'' +
                ", sinifi=" + sinifi +
                ", notes=" + notes +
                ", derseGoreNotlar=" + derseGoreNotlar +
                "} " + super.toString();
    }
}
