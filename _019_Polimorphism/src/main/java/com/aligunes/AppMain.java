package com.aligunes;

public class AppMain {
    public static void main(String[] args) {

        Personel personel = new Personel();
        personel.setAdi("");

        Muhasebe muhasebe = new Muhasebe();
        muhasebe.setAdi("Burak");
        muhasebe.setSoyadi("Delice");
        muhasebe.setMaliYetki(Boolean.TRUE);
        muhasebe.setKidemYili((short) 3);

        System.out.println("ADI: " +muhasebe.getAdi());
}