package com.aligunes.array_metot_bolumsonucozumleri;

public class Cozum4 {
    public static void main(String[] args) {
        int birinciSayi = 40 , ikiniciSayi = 21;



     //  int ekok = klasikEkokBul(birinciSayi, ikiniciSayi);
     //   System.out.println(birinciSayi+ " ile " +ikiniciSayi+ " ekoku: "+ekok);


     //   ebobBul(birinciSayi, ikiniciSayi);
        int ekok = ekokBul(birinciSayi, ikiniciSayi);
     //   int ebob = ebobBul(15,45);
       //  System.out.println("ebob: "+ebob);
        System.out.println("ekok: "+ekok);
    }
    private static int ekokBul(int birinciSayi, int ikinciSayi){

        //ebob * ekok = s1*s2;
        int ekok = (birinciSayi * ikinciSayi) / ebobBul(birinciSayi,ikinciSayi);
        return ekok;
    }

    private static int ebobBul(int birinciSayi, int ikiniciSayi) {
        int ebob = 1;
        int kontrol = 2;

        while (kontrol <= birinciSayi && kontrol <= ikiniciSayi){
            if (birinciSayi % kontrol == 0 && ikiniciSayi % kontrol== 0){
                ebob = kontrol;
            }
            kontrol++;
        }
        if (ebob == 1){
            System.out.println(birinciSayi + " ve "+ ikiniciSayi+ " aralarında asaldır");
        }else{
            System.out.println(birinciSayi + " ve " + ikiniciSayi+ " sayılarının en büyük ortak böleni : "+ebob);
        }
        return ebob;

    }


    private static int klasikEkokBul(int birinciSayi, int ikiniciSayi) {

        int buyuk= Math.max(birinciSayi, ikiniciSayi);
        int ekok = 0;
        for (int i=buyuk; i <= birinciSayi*ikiniciSayi; i++){
            if (i % birinciSayi == 0 && i % ikiniciSayi == 0){
                ekok = i;
                break;
            }
        }
        return ekok;
    }
}
