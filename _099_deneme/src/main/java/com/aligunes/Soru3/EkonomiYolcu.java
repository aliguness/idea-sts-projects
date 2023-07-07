package com.aligunes.Soru3;

import java.util.HashMap;
import java.util.Map;

public class EkonomiYolcu  extends Yolcu{
    private static final int EKONOMIFIYAT = 100;
    private Map<String, Integer> biletler;

    public EkonomiYolcu(int id, String ad, String soyad) {
        super(id, ad, soyad);
        this.biletler = new HashMap<>();
    }

    @Override
    public void yolcuBilgileriniGetir() {
        System.out.println("Ekonomi Yolcusu " + ad + " " + soyad + " Biletleri: " + biletler);

    }

    @Override
    public void biletAl(FirmaAdi firmaAdi) {
        String firma = firmaAdi.toString();
        int biletFiyati = BASEFIYAT + EKONOMIFIYAT;

        if (biletler.containsKey(firma)){
            biletFiyati+=biletler.get(firma);
        }
        biletler.put(firma, biletFiyati);
        System.out.println(ad + " Adlı yolcu" + firma+ "için ekonomi sınıfından bilet almıştır. Biletleriniz --> " + biletler);
    }

    @Override
    public void checkInYap() {
        System.out.println(ad + " için check-in yapılmıştır. İyi uçuşlar!");

    }

    @Override
    public void ucagaBin() {
        System.out.println(ad + " "+koltukNo+" Numaralı koltukta uçağa binebilirsiniz");

    }

}
