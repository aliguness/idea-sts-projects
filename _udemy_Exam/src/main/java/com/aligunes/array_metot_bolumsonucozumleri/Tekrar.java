package com.aligunes.array_metot_bolumsonucozumleri;

public class Tekrar {
    public static void main(String[] args) {
        String kartTurleri [] ={"Kupa","Maça","Karo","Sinek"};
        String kartNumaralari[] ={"As","2","3","4","5","6","7","8","9","10","J","Q","K"};

        int [] deste= new int[52];

        desteOlustur(deste);
        desteKaristir(deste);
        desteGoster(deste, kartTurleri, kartNumaralari);


    }

    private static void desteKaristir(int[] deste) {
        for (int i=0; i < deste.length;i++){
            int rastgeleIndex= (int) (Math.random()* deste.length);
            int gecici= deste[i];

            deste[i] = deste[rastgeleIndex];
            deste[rastgeleIndex] = gecici;

        }
    }

    private static void desteGoster(int[] deste, String[] kartTurleri, String[] kartNumaralari) {
        for (int i = 0; i < deste.length; i++){

            String kartTuru = kartTurleri[deste[i] / 13];
            String kartNo = kartNumaralari[deste[i] % 13];

            System.out.println(kartTuru+" "+ kartNo);

        }
    }

    private static void desteOlustur(int[] deste) {
        for (int i=0; i < deste.length; i++){

            deste[i] =i;

        }
    }
}
