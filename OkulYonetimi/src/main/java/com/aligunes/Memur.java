package com.aligunes;

import java.time.LocalDate;

public class Memur extends  Personel{

    private String numara;
    private static int numaraSayar = 1;

    public Memur(String isim, String soyisim, double maas, LocalDate iseBaslamaTarihi) {
        super(isim, soyisim, maas, iseBaslamaTarihi);
        this.numara= "0F-" + numaraSayar++;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    @Override
    public String toString() {
        return "Memur{" +
                "numara='" + numara + '\'' +
                "} " + super.toString();
    }

    public void dersAta(Ogrenci ogrenci, EDers ders){
        if (ogrenci.getSinifi().dersler.equals(ders)){
            System.out.println("Öğrenci zaten bu derse sahiptir.");

        }else {
            ogrenci.getSinifi().dersler.add(ders);
        }
    }
}
