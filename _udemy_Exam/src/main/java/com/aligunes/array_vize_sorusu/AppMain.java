package com.aligunes.array_vize_sorusu;

import java.util.Scanner;

public class AppMain {
    //SORU 1: 5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.
    //Bu matrisi ekrana    yazdıran ve çapraz elemanların toplamını gösteren programı yazınız.

    //SORU 2: Decimal sayıları binary formatına çeviren java programını yazınız.
    //Program 30 sayısı için 1 1 1 1 0 çıktısını üretmeli, String kullanabilirsiniz.

    //SORU 3: küçük xlerle büyük X şekli çizen programı yazınız.
        //Mesela satır sayısı olarak 5 alan program şunu yazmalı
     /*
     * X     X
     *  X   X
     *    X
     *  X   X
     * X     X
     * */

    public static void main(String[] args) {
        int [][] matrix = new int[5][5];
        int genelToplam = 0;

        for (int i=0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                matrix[i][j]= (int) (Math.random() *10);
                System.out.print(matrix[i][j]+ " ");
            }
            genelToplam = genelToplam + matrix[i][i];
            System.out.println();
        }
        System.out.println("çapraz elemanların toplamı : "+ genelToplam);

        // X şekli yaptırmaya çalışılan soru.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int satirSayisi = scanner.nextInt();

        for (int i=0; i < satirSayisi; i++){
            for (int j=0; j < satirSayisi; j++){
                if (i == j || j == (satirSayisi-i-1)){
                    System.out.print("x");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }

    }

}
