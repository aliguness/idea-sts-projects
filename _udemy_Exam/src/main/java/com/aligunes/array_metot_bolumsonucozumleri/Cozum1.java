package com.aligunes.array_metot_bolumsonucozumleri;

public class Cozum1 {
    public static void main(String[] args) {
        int sayilar[] = new int[100];
        int tumSayilarinToplamı = 0;

        for (int i= 0; i <sayilar.length; i++){
            int rastgeleSayi = (int) (Math.random() * 100);
            sayilar[i] = rastgeleSayi;
            tumSayilarinToplamı += rastgeleSayi;

        }
        double ortalama =(double) tumSayilarinToplamı/sayilar.length;


        int ortalamaAltindakiDegerlerinSayisi = 0;

        for (int i = 0; i < sayilar.length; i++){
            if (sayilar[i] < ortalama){
                ortalamaAltindakiDegerlerinSayisi++;
            }
        }
        System.out.println("Ortalama: "+ortalama + " ve ortalama altındaki değerlerin sayısı: "+ ortalamaAltindakiDegerlerinSayisi);


    }
}
