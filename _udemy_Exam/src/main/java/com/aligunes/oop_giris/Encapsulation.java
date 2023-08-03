package com.aligunes.oop_giris;

public class Encapsulation {
    public static void main(String[] args) {
        Televizyon tv = new Televizyon();
        tv.ac();
        tv.kapat();
        tv.setSesSeviyesi(15);
        tv.setKanal(620);
        tv.kapat();

        tv.goster();
    }
}
