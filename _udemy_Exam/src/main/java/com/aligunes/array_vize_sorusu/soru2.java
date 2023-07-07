package com.aligunes.array_vize_sorusu;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Lütfen sayı girinizi");
        int girilenSayi = tara.nextInt();
        String binarySayi = "";

        if (girilenSayi == 0){
            binarySayi = "0";
        }
        while (girilenSayi > 0){

            int mod = girilenSayi % 2;
            binarySayi = mod + binarySayi;
            girilenSayi = girilenSayi / 2;

        }
        System.out.println("Sayının binary hali: " +binarySayi);
    }
}
