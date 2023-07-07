package com.aligunes;


public class AppMain {
    public static void main(String[] args) {

        Kedi obj1 = new Kedi();
        Kopek obj2 = new Kopek();
        Kus obj3 = new Kus();

        obj1.ses();
        obj2.ses();
        obj3.ses();

        if (obj1 instanceof  Hayvan){
            System.out.println(obj1);
        }

        if (obj2 instanceof  Hayvan){
            System.out.println(obj2);
        }
        if (obj3 instanceof  Hayvan){
            System.out.println(obj3);
        }

    }
}