package com.aligunes.oop_giris;

public class Ogrenci {
  private   int ogrenciNo;
    private String isim;
    private byte sinif;
    private boolean aktif;
    public Ogrenci(){
        System.out.println("öğrenci nesnesi oluştruluyor");
        aktif = true;

    }

    public void dersAl(){
        System.out.println("Öğrenci ders alıyor");
    }

    public void ogrenciBilgileriniYazdir(){
        if (aktif){
            System.out.println("Adim: "+isim+ " numaram: "+ogrenciNo+" sinifim: "+sinif);

        }else {
            System.out.println("öğrenci aktif değil");
        }
    }
}
