package com.aligunes.v2;

import com.aligunes.v1.JenerikSinifOrnegi;

public class AppMain {
    public static void main(String[] args) {
                        //   K       V              // burada sınıfın tipinde nesne tanımladık
        JenerikSinifCiftli<Integer, String> obj1 = new JenerikSinifCiftli<>(1, "Adana");
        JenerikSinifCiftli<String, String> obj2 = new JenerikSinifCiftli<>("6", "Ankara");

        obj1.bilgiGoster();
        System.out.println(obj1.getPlaka()+ " " + obj1.getSehir());
        System.out.println("-------------------");
        obj2.bilgiGoster();
        System.out.println(obj2.getPlaka()+ " " + obj2.getSehir());

    }
}
