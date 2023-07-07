package com.aligunes;

public class DiziKarmaSiralamaArama {

    public static void main(String[] args) {

        int sayilar[] = {1,9,5,2,7,9,60,120,55,-9};

       // diziYazdir(sayilar);
        diziYerDegistir(sayilar);
        System.out.println("\nyer değiştirme metodundan sonra dizi");
        diziYazdir(sayilar);
        selectionSortSiralama(sayilar);
        System.out.println("sıralama metodundan sonra dizi");
        diziYazdir(sayilar);

        System.out.println("\nbinary metodundan sonra dizi");
        int sonuc = binarySearch(sayilar, 3);
        System.out.println("Sonuc: "+ sonuc);


    }

    public static int binarySearch(int[] dizi, int aranacakEleman){
        int enDusukIndex =0;
        int enYuksekIndex = dizi.length - 1;

        while (enYuksekIndex >= enDusukIndex){

            int ortaIndex = (enDusukIndex+enYuksekIndex)/2;
            if (aranacakEleman < dizi[ortaIndex]){
                enYuksekIndex = ortaIndex -1;
            } else if (aranacakEleman == dizi[ortaIndex]) {
                return ortaIndex; // aranılacak elemanın bulunduğu indexi döndürür.
            }else{
                enDusukIndex = ortaIndex + 1;
            }
        }
        return -enDusukIndex - 1;
    }


    public static void diziYerDegistir(int[] dizi){

        for (int i = dizi.length - 1; i > 0; i--) {

            int rastgeleIndex = (int) (Math.random() * (i+1));
            int gecici = dizi[i];
            dizi[i] = dizi[rastgeleIndex];
            dizi[rastgeleIndex] = gecici;
        }
    }

    public static void selectionSortSiralama(int[] dizi){
        for (int i=0; i< dizi.length-1; i++){


            // en küçük elemanın ve indexinin bulunması
            int oankiEnKucukSayi = dizi[i];
            int oankiEnKucukElemaninIndex = i;

            for (int j=i+1; j<dizi.length; j++){
                if (oankiEnKucukSayi >dizi[j]){
                    oankiEnKucukSayi = dizi[j];
                    oankiEnKucukElemaninIndex= j;
                }

            }
            if (oankiEnKucukElemaninIndex != i){
                dizi[oankiEnKucukElemaninIndex] = dizi[i];
                dizi[i] = oankiEnKucukSayi;
            }

        }
    }
    public static void diziYazdir(int[] dizi){

        for (int i : dizi) {

            System.out.print( i + ",");
        }
    }

}
