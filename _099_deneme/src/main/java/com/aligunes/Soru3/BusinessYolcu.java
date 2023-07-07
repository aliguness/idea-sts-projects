package com.aligunes.Soru3;

import java.util.HashMap;
import java.util.Map;

public class BusinessYolcu extends Yolcu{

    private  static final int BUSINESSFIYAT = 200;
    private  static final int BUSINESSVIPFIYAT = 150;
    private boolean vip;
    private Map<String, Integer> biletler;

    public BusinessYolcu(int id, String ad, String soyad, boolean vip) {
        super(id, ad, soyad);
        this.vip = vip;
        this.biletler = new HashMap<>();
    }

    @Override
    public void yolcuBilgileriniGetir() {
        System.out.println("Business Yolcusu " + ad + " " + soyad + "Biletleri: " + biletler);

    }

    @Override
    public void biletAl(FirmaAdi firmaAdi) {
        int biletFiyati;
        if (vip) {
            biletFiyati = BASEFIYAT +BUSINESSFIYAT + BUSINESSVIPFIYAT;
        }else{
            biletFiyati = BASEFIYAT + BUSINESSFIYAT;
        }

        String firma = firmaAdi.toString();
        if (!biletler.containsKey(firma)) {
            biletler.put(firma, biletFiyati);
        }
        System.out.println(ad + " adlı yolcu" + firma + " için"+ (vip ? "VIP" : "") + "bilet almıştır. Biletleriniz --> "+biletler);
    }

    @Override
    public void checkInYap() {
        if (vip){
            System.out.println(ad + " check-in zaten yapılmıştır. Uçağa binebilirsiniz.");
        }else {
            System.out.println(ad + " check-in zaten yapılmıştır. İyi uçuşlar!");
            vip = true; // bu kısma dikkat sojradan bak
        }

    }

    @Override
    public void ucagaBin() {
        if (!vip) {
            System.out.println("Uçağa binmek için lütfen check-in yapın.");
        }else {
            System.out.println(ad + " " + koltukNo + " Numaralı koltukta uçağa binebilirsiniz.");
        }

    }


}
