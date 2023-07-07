package com.aligunes.v2;

import java.util.ArrayList;

public class AppMain {

    public static void main(String[] args) {
        ArrayList<String> listeArrayList = new ArrayList<>(); // javanın bize verdiği liste.
        ListManager<String> listeBanaOzel = new ListManager<>(); // bu bana ozel liste.
        listeBanaOzel.listeyeEkle("Aminenur");
        listeBanaOzel.listeyeEkle("Aysu");
        listeBanaOzel.listeyeEkle("Gizem");

        System.out.println(listeBanaOzel.ListeyiGetir());

        ListManager<Integer> listebanaOzel2 = new ListManager<>();

        listebanaOzel2.listeyeEkle(100);
        listebanaOzel2.listeyeEkle(200);
        listebanaOzel2.listeyeEkle(300);
        System.out.println(listebanaOzel2.ListeyiGetir());


        ArrayList<String> listeYazdirilacak = listeBanaOzel.ListeyiGetir();

        for ( String madde: listeYazdirilacak) {
            System.out.println(madde+ " ");
        }

        for (int i = 0; i < listeYazdirilacak.size(); i++){
            System.out.println(listeYazdirilacak.get(i));
        }
        System.out.println("-------------------------------");


        }
    }

