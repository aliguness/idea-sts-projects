package com.aligunes.v3;

public class CalisanManager <BenimKendiTipim>{

    BenimKendiTipim maas;

    private String kayitNumarasi;
    String ad, soyad;

    private final String SIRKET_ADI = "ABC";

    public String getBilgiAl(){
        return "ADI: "+ ad + " Soyadı: "+soyad+ " Maaşı: "+ maas + " " +"No: " +kayitNumarasi;
    }

    public String getKayitNumarasi() {


        return kayitNumarasi;
    }

    public void setKayitNumarasi(String kayitNumarasi) {
        this.kayitNumarasi = kayitNumarasi;
    }
}
