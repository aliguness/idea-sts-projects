package com.aligunes;

public class Dikdortgen {

   private int uzunKenar; // 10
   private int kisaKenar; // 3

    // Hazırlık
    public Dikdortgen(int uzunKenar, int kisaKenar) { //sınıfın hazırlayıcı ondan public olması önemli
        this.uzunKenar = uzunKenar; // 10
        this.kisaKenar = kisaKenar; // 3
    }

    public int getHesaplaAlan(){ //sıradan method ve public kaldırılsada kullanılabilir. Çünkü aynı package'de olduğu için kullanıldabildi. Aynı zamanda rastgele kullanımını önlemek için.
       /*
        int sonuc = this.uzunKenar * this.kisaKenar);
        return sonuc;
        */
        return this.uzunKenar*this.kisaKenar; // 10 * 3  // This'leri kullanmasakta olur
    }
    public int getHesaplaCevre(){
     //   int sonuc = 2*(this.uzunKenar+this.kisaKenar);
      //  return sonuc;
        return 2*(this.uzunKenar+this.kisaKenar); // this' leri kullanmasakta olur.

    }
}
