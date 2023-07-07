package com.aligunes;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        List liste1 = new ArrayList();
        liste1.add(10); // Integer
        liste1.add("Serkan"); //serkan
        liste1.add(30.0f);
        System.out.println(liste1);


        List<String> liste2 = new ArrayList<String>();
        liste2.add("Abdullah"); // 0
        liste2.add("Gizem"); // 1
        System.out.println(liste2);

        List<Integer> liste3 = new ArrayList<>();

        liste3.add(0,0);  // indexli veri girerken veriler Sıralı girilmeli yoksa hata verir.
        liste3.add(1,100);
        liste3.add(2, 200); //200
        System.out.println(liste3);

    }
}