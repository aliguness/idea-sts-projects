package org.turkeyjug;

public class AppMain {

    public static void main(String[] args) {

        Araba araba = new Araba("Mercedes", "Mavi", 2023, 1000);
        System.out.println(araba);

        araba = new Araba("Serçedes", "Kırmızı", 2000, 250);
        System.out.println(araba);

        System.out.println(new Araba("Anadol", "Sarı", 2020, 500));

        araba.setMarka("Volvo"); // çalışma zamanında değiştirdik.
        araba.setModel(2021);
        araba.setMotorHacmi(2500);
        araba.setRenk("Turuncu");
        System.out.println(araba);

        int modelSayi = araba.getModel();
        System.out.println(modelSayi);

        double motorHacmi = araba.getMotorHacmi();
        System.out.println(motorHacmi);

    }
}
