package com.aligunes;

import java.util.Arrays;

public class ArraysSinifiKullanimi {
    public static void main(String[] args) {
        int[] sayilar = {8,7,2,-8,14,19,11};
        int[] sayilar2 = {8,7,2,-8,14,19,11};
        System.out.println("Sıralama öncesi dizi");
        diziYazdir(sayilar);

      //  Arrays.sort(sayilar);
      //  Arrays.sort(sayilar,2,5);
          Arrays.parallelSort(sayilar);
          Arrays.parallelSort(sayilar2);
        System.out.println("\nSıralama sonrası dizi");
        diziYazdir(sayilar);

       int sonuc = Arrays.binarySearch(sayilar,11);
        System.out.println("Sonuc : " + sonuc);

        System.out.println("sayilar1 ve sayilar2 aynı mı : " + Arrays.equals(sayilar, sayilar2));

        int[] yeniDizi = new int[20];
        Arrays.fill(yeniDizi,0,5,95);
        System.out.println("\nYeni Dizi\n");
        diziYazdir(yeniDizi);


    }

    public static void diziYazdir(int[] dizi){
        for(int i : dizi){
            System.out.print(i +",");
        }

    }
}
