package com.aligunes.v1;

public class AppMain {
    public static void main(String[] args) {

        JenerikSinifOrnegi<Integer> obj1 = new JenerikSinifOrnegi<>(25);
        JenerikSinifOrnegi<Double>  obj2 = new JenerikSinifOrnegi<>(34.2);
        JenerikSinifOrnegi<Character> obj3 = new JenerikSinifOrnegi<>('A');
        JenerikSinifOrnegi<String> obj4 = new JenerikSinifOrnegi<>("Yiğitcan");

        System.out.println(obj1.getNesne());
        System.out.println(obj2.getNesne());
        System.out.println(obj3.getNesne());
        System.out.println(obj4.getNesne());

        System.out.println(obj1);

        obj3.setNesne('Y');
        System.out.println(obj3.getNesne()); // Setler çalışma zamanında bir şeyin değerini değiştirmede kullanılır.
     }
}