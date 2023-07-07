package com.aligunes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Byte en kucuk değeri:" + Byte.MIN_VALUE + " Byte en büyük değer:" + Byte.MAX_VALUE + " Kaç Bit:" + Byte.SIZE);
        System.out.println("double min:"+Double.MIN_VALUE+"\ndouble max:"+ Double.MAX_VALUE+"\nkaç bit:"+Double.SIZE);

        String stringDegiskeni= "150";
        int integerDegiskeni = Integer.parseInt(stringDegiskeni);
        int integerDegiskeni2 = Integer.valueOf(stringDegiskeni);

        System.out.println("1 numara: "+ integerDegiskeni);
        System.out.println("2 numara: "+ integerDegiskeni2);

        stringDegiskeni = String.valueOf(integerDegiskeni);
        System.out.println("intten stringe donusum: "+ stringDegiskeni);
        System.out.println("=============================");

        //ODEV 2

        Scanner scanner = new Scanner(System.in);
        int sansliSayi= (int) Math.random() * 99 + 1;
        System.out.println("tahmin giriniz");
        int tahminEdilenSayi = scanner.nextInt();

        if(sansliSayi == tahminEdilenSayi){
            System.out.println("tebrikler 1000 tl kazandınız şanslı sayi: " + sansliSayi+ " sizin tahmin: " + tahminEdilenSayi);
        }

    }
}