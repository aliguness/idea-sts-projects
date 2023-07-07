package com.aligunes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Personel extends Kisi{

    private double maas;
    private LocalDate iseBaslamaTarihi;
    private int izinHakki = 20;
    private int raporHakki = 20;

    public Personel(String isim, String soyisim, double maas, LocalDate iseBaslamaTarihi) {
        super(isim, soyisim);
        this.maas = maas;
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public LocalDate getIseBaslamaTarihi() {
        return iseBaslamaTarihi;
    }

    public void setIseBaslamaTarihi(LocalDate iseBaslamaTarihi) {
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }

    public int getIzinHakki() {
        return izinHakki;
    }

    public void setIzinHakki(int izinHakki) {
        this.izinHakki = izinHakki;
    }

    public int getRaporHakki() {
        return raporHakki;
    }

    public void setRaporHakki(int raporHakki) {
        this.raporHakki = raporHakki;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "maas=" + maas +
                ", iseBaslamaTarihi=" + iseBaslamaTarihi +
                ", izinHakki=" + izinHakki +
                ", raporHakki=" + raporHakki +
                "} " + super.toString();
    }

    public double maasZammi(LocalDate date){
        if (iseBaslamaTarihi.until(date, ChronoUnit.YEARS) >=1){
            for (int i=0; i<iseBaslamaTarihi.until(date, ChronoUnit.YEARS);i++){
                maas*=1.25;
            }

        }
        return maas;
    }

    public void izinAl(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalan izin gün sayısı: "+ izinHakki);
        int istenenIzin =scanner.nextInt();

        if (istenenIzin > izinHakki){
            System.out.println(" İzin sınırını aştınız.");
        }else {
            setIzinHakki(izinHakki-istenenIzin);
            System.out.println("İzniniz olumlu değerlendirilmiştir. Kalan izin hakkınız : "+ izinHakki);
        }
    }

    public void raporAl(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalan rapor gün sayısı: "+ raporHakki);
        int istenenRaporGunu =scanner.nextInt();

        if (istenenRaporGunu > raporHakki){
            System.out.println(" İzin sınırını aştınız.");
        }else {
            setRaporHakki(raporHakki-istenenRaporGunu);
            System.out.println("Raporunuz olumlu değerlendirilmiştir. Kalan rapor hakkınız : "+ raporHakki);
        }
    }

}
