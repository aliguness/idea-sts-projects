package com.aligunes.Soru3;

public class Test {
    public static void main(String[] args) {
        Yolcu yolcu = new BusinessYolcu(7250, "Ali", "Gorbaçov", false);
        Yolcu yolcu2 = new EkonomiYolcu(669,"Serkan","Zorlu");
        Yolcu yolcu3 = new BusinessYolcu(333,"Gizem", "Bahar",true);

        System.out.println("*****Business VIP Yolcu*****");
        yolcu3.biletAl(FirmaAdi.ADJ);
        yolcu3.biletAl(FirmaAdi.THY);
        System.out.println("***");
        yolcu3.ucagaBin();
        yolcu3.ucagaBin();
        yolcu3.checkInYap();
        yolcu3.checkInYap();
        yolcu3.ucagaBin();
        yolcu3.yolcuBilgileriniGetir();

        System.out.println("*****Ekonomi Yolcu*****");
        yolcu2.biletAl(FirmaAdi.ADJ);
        yolcu2.biletAl(FirmaAdi.THY);
        yolcu2.biletAl(FirmaAdi.THY);
        yolcu2.biletAl(FirmaAdi.THY);
        System.out.println("***");
        yolcu2.ucagaBin();
        yolcu2.ucagaBin();
        yolcu2.checkInYap();
        yolcu2.checkInYap();
        yolcu2.ucagaBin();
        yolcu2.yolcuBilgileriniGetir();

        System.out.println("*****Business VIP Yolcu*****");
        yolcu.biletAl(FirmaAdi.PEGASUS);
        yolcu.biletAl(FirmaAdi.THY);
        System.out.println("***");
        yolcu.ucagaBin();
        yolcu.ucagaBin();
        yolcu.checkInYap();
        yolcu.checkInYap();
        yolcu.ucagaBin();
        yolcu.yolcuBilgileriniGetir();


    }

}
