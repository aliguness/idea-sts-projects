package com.aligunes;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class OkulManager {

    public static <T> void kayitEt(List<T> list, T t){

        if (list.contains(t)){
            System.out.println("kişi zaten listede");
        }else {
            list.add(t);
            System.out.println(t + "başarılı bir şekilde kaydedilmiştir.");
        }

    }
    public static  <T> void KayıtSil(List<T> list, T t){
        if (list.contains(t)){
            list.remove(t);
            System.out.println("kişi başarılı bir şekilde kaldırılmıştır.");
        }else {
            System.out.println("kişi listede bulunamadı");
        }
    }

    public static <T> void verileriGetir(T t){
        if (t ==null){
            System.out.println("Böyle bir bilgi bulunamamıştır");
        }else{
            System.out.println(t);
        }
    }

public static void ogretmenOlustur(Okul okul){
        Ogretmen ogretmen1 = new Ogretmen("Ali", "Güneş", 30000, LocalDate.of(2018,11,19),ESinif.SINIF1);
        Ogretmen ogretmen2 = new Ogretmen("Ahmet", "Soda", 10000, LocalDate.of(2015,11,19),ESinif.SINIF2);

        kayitEt(okul.getOgretmenList(),ogretmen1);
        kayitEt(okul.getOgretmenList(),ogretmen2);

}
    public static void ogrenciOlustur(){
        Ogrenci ogrenci1 = new Ogrenci("kadir", "yıldırım",ESinif.SINIF1);
        Ogrenci ogrenci2 = new Ogrenci("ali", "yıldırım",ESinif.SINIF2);

        kayitEt(okul.getOgrenciList(),ogrenci1);
        kayitEt(okul.getOgrenciList(),ogrenci2);
    }

    public  static  void  sinifOlustur(Okul okul){
        Sinif sinif1 = new Sinif(ESinif.SINIF1, okul.getOgretmenList().get(0));
        Sinif sinif2 = new Sinif(ESinif.SINIF1, okul.getOgretmenList().get(1));

        kayitEt(okul.getSinifList(),sinif1);
        kayitEt(okul.getSinifList(),sinif2);

    }

    public static void memurOlustur(){
        Memur memur1 = new Memur("Ali", "Gun",20000, LocalDate.of(2021, 10, 12));
        Memur memur2 = new Memur("Veli", "Gun",18000, LocalDate.of(2021, 12, 15));


    }

    public static double ortalamaHesapla(Ogrenci ogrenci){
        return ogrenci.getNotes().stream().collect(Collectors.averagingDouble(x-> x));

    }
    public static void RandomOgrenci(Okul okul){
        Random random = new Random();
        int index = random.nextInt(okul.getOgrenciList().size());
        ortalamaHesapla(okul.getOgrenciList().get(index));
    }

}
