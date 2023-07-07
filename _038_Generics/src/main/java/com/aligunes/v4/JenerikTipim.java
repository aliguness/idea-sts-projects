package com.aligunes.v4;

public class JenerikTipim<T> {  // normal bir class'ta yaptığımız her şeyi yapabiliyoruz.
                                // T kısmına biz ne yazarsak o TİP olur.
    private T benimNesnem;

    public JenerikTipim(T benimNesnem){
        this.benimNesnem = benimNesnem;
    }

    public T getBenimNesnem() {
        return benimNesnem;
    }

    public void setBenimNesnem(T benimNesnem) {
        this.benimNesnem = benimNesnem;
    }

    public void sinifinTipiniYazdir(){
        System.out.println("sınıfın tipi : "+ benimNesnem.getClass().getName());
    }
}
