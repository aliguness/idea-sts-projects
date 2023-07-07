package com.aligunes.array_metot_bolumsonucozumleri;

public class Cozum2 {
    //rastgele olusturulmus 3*2lik matriste bulunan sayıların toplamını yazdır.
    //Bu matriste yer alan en büyük ve en küçük sayıyı da mesaj olarak göstersin.
    public static void main(String[] args) {
        int [][] matris = new int[3][2];
        int enKucukSayi= 999 , enBuyukSayi=0;

        for (int satir=0; satir < matris.length; satir++){
            for (int sutun=0; sutun < matris[satir].length; sutun++){
                int rastgeleSayi = (int) (Math.random()*100);
                matris[satir][sutun] = rastgeleSayi;
                System.out.println(satir+ " . satırdaki " + sutun + " . sutunun elemanı: "+ matris[satir][sutun]);

                if (enKucukSayi > rastgeleSayi){
                    enKucukSayi = rastgeleSayi;
                }
                if (enBuyukSayi < rastgeleSayi){
                    enBuyukSayi = rastgeleSayi;
                }

            }

        }
        System.out.println("Bu matristeki En küçük sayi:"+enKucukSayi+ " en büyük sayı:"+ enBuyukSayi);


    }

}
