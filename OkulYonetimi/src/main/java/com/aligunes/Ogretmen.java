package com.aligunes;

import java.time.LocalDate;

public class Ogretmen extends Personel{

    private ESinif sinif;
    private String numara;
    private  static int numaraSayar = 1;

    public Ogretmen(String isim, String soyisim, double maas, LocalDate iseBaslamaTarihi, ESinif sinif) {
        super(isim, soyisim, maas, iseBaslamaTarihi);
        this.sinif = sinif;
        this.numara = "T-"+numaraSayar++;
    }

    public ESinif getSinif() {
        return sinif;
    }

    public void setSinif(ESinif sinif) {
        this.sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "sinif=" + sinif +
                ", numara='" + numara + '\'' +
                "} " + super.toString();
    }
}
