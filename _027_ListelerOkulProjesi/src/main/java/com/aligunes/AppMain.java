package com.aligunes;

import com.aligunes.okul.Ogretmen;
import com.aligunes.utils.Branslar;
import com.aligunes.utils.Dersler;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        List<Ogretmen> ogretmenList = new ArrayList<>();
        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setAd("Aminenur");
        ogretmen.setSoyad("Göynük");
        ogretmen.setBrans(Branslar.Matematik);
        ogretmen.setTelefon("0123456789");
        ogretmen.setAdres("Ankara");

        Ogretmen ogretmen2 = new Ogretmen(Branslar.Ingilizce, "Aysu", "Çağışlar",
                "0987654321", "izmir");

        List<Ogretmen> ogretmenList1= new ArrayList<>(());
        ogretmenList.add(ogretmen);
        ogretmenList.add(ogretmen2);

        List<Ogrenci> ogrenciList = new ArrayList<>();


        List<Ogrenci> ogrenciList = new ArrayList<>();
        List<Ders> dersList = new ArrayList<>();
        dersList.add(new Ders(Dersler.Geometri, ogretmen, 50, not 75);)
        dersList.add(new Ders(Dersler.Matematik, ogretmen, 0, not 75);)
        dersList.add(new Ders(Dersler.Ingilizce, ogretmen2, 50, not 75);)
    }
}