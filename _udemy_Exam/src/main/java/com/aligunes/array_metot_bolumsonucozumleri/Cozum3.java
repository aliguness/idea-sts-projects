package com.aligunes.array_metot_bolumsonucozumleri;

public class Cozum3 {
    //iskambil destesini diziler ile oluştur. Sonrasında bu destedeki elemanları karıştır ve
    //ve ilk kullanıcıya hangi 4 kartın geldiğini ekrana yazdır.
    public static void main(String[] args) {
        String kartTurleri [] ={"Kupa","Maça","Karo","Sinek"};
        String kartNumaralari[] ={"As","2","3","4","5","6","7","8","9","10","J","Q","K"};

        int deste[] = new int[52];

        desteyiOlustur(deste);
        desteyiKaristir(deste);
        desteyiGoster(deste, kartTurleri,kartNumaralari);
        desteninIlkDortElemanı(deste, kartTurleri, kartNumaralari);


    }

    private static void desteninIlkDortElemanı(int[] deste, String[] kartTurleri, String[] kartNumaralari) {
        for (int i=0; i < 4; i++){
            String kartTuru1= kartTurleri[deste[i]/13];
            String kartNo= kartNumaralari[deste[i] %13];

            System.out.println("ilk kullanıcı: "+kartTuru1+" "+kartNo);

        }

    }

    private static void desteyiKaristir(int[] deste) {
        for (int i=0; i < deste.length; i++){
            int rastgeleIndex = (int) (Math.random() * deste.length);
            int gecici = deste[i];

            deste[i]  = deste[rastgeleIndex];
            deste[rastgeleIndex] = gecici;

        }
    }

    private static void desteyiGoster(int[] deste, String[] kartTurleri, String[] kartNumaralari) {
        for (int i=0; i<deste.length;i++){
            String kartTuru = kartTurleri[deste[i] / 13];
            String kartNumarasi = kartNumaralari[deste[i] % 13];

            System.out.println(kartTuru+ " " +kartNumarasi);

        }
    }


    private static void desteyiOlustur(int[] deste) {

        for (int i=0; i<deste.length;i++){
            deste[i] = i;
        }
    }

}
