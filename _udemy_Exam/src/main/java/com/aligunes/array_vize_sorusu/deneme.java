package com.aligunes.array_vize_sorusu;

public class deneme {
    public static void main(String[] args) {
        int [][] matris = new int[5][5];
        int genelToplam = 0;

        for (int i=0; i < 5; i++){
            for (int j=0; j<5; j++){
                 matris [i][j] = (int) (Math.random() * 10);
                System.out.print(matris[i][j] + " ");
            }
            genelToplam = genelToplam + matris[i][i];
            System.out.println();
        }
        System.out.println("çapraz elemanların toplamı : "+ genelToplam);
    }
}
