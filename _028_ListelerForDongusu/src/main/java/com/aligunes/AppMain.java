package com.aligunes;


import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {
        List<String> listeOgrenci = new ArrayList<>();
        listeOgrenci.add("Ahmet");
        listeOgrenci.add("Gizem");
        listeOgrenci.add("Ali");
        listeOgrenci.add("Salih");
        listeOgrenci.add("Burak");
        System.out.println(listeOgrenci);
                // Tekil    :   Çoğul
        for (String ogrenci : listeOgrenci){
                System.out.println(ogrenci);
            }

    }
}