package com.aligunes.soru4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UrunFiltreleme {
    public static void main(String[] args) {
        List<Urun> urunList  = new ArrayList<>();

        Urun urun1 = new Urun("ev",100000);
        Urun urun2 = new Urun("erik",10);
        Urun urun3 = new Urun("telefon",18000);
        Urun urun4 = new Urun("kulaklık",5000);
        Urun urun5 = new Urun("koltuk",10000);
        Urun urun6 = new Urun("ayakkabı",2000);

        urunList.add(urun1);
        urunList.add(urun2);
        urunList.add(urun3);
        urunList.add(urun4);
        urunList.add(urun5);
        urunList.add(urun6);

        Map<String, Double> urunMap2 = new HashMap<>();

        urunMap2= urunList.stream().filter(u->u.getFiyat()<100000 && u.getFiyat()>500)
                        .collect(Collectors.toMap(x->x.getAd(), y-> y.getFiyat()));

        System.out.println("Fiyatı 100000 olandan düşük ve 500 den büyük olan ürünler ve fiyatları -->");
        urunMap2.forEach((k,v) -> System.out.println(k + "'nın fiyatı " + v));
    }
}
