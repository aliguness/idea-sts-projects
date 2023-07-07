package com.aligunes.v2;

                            // Verdiğiniz Tip'ler K  V.
public class JenerikSinifCiftli <K, V > {

    private K plaka;
    private V sehir;



    public JenerikSinifCiftli(K plaka, V sehir) {
        this.plaka = plaka;
        this.sehir = sehir;
    }

    public K getPlaka() {
        return plaka;
    }

    public void setPlaka(K plaka) {
        this.plaka = plaka;
    }

    public V getSehir() {
        return sehir;
    }

    public void setSehir(V sehir) {
        this.sehir = sehir;
    }

    public void bilgiGoster (){
        System.out.println("K'nin tipi: " + plaka.getClass().getName());
        System.out.println("V'nin tipi: " + sehir.getClass().getName());
    }
}
