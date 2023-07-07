package com.aligunes.Soru3;

import java.util.Random;

public abstract class Yolcu {
    protected static final int BASEFIYAT = 100;
    private static final Random random = new Random();

    protected int id ;
    protected String ad;
    protected String soyad;
    protected int koltukNo;

    public Yolcu(int id, String ad, String soyad) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.koltukNo = random.nextInt(100)+ 1; //burada koltuk oluşturdum eğer random hatası olursa buraya bak.
    }

    public abstract void yolcuBilgileriniGetir();
    public abstract void biletAl(FirmaAdi firmaAdi);
    public abstract void checkInYap();
    public abstract void ucagaBin();

}
