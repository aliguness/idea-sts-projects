package com.aligunes.org.turkeyjug;

public class AppMain {
    public static void main(String[] args) {

        Tasit tasit = new Tasit();
        tasit.yazdir();

        Araba araba = new Araba();
        araba.setTekerSayisi(4);
     //   System.out.println("ARABA: " + araba.getTekerSayisi());
        araba.yazdir();
        Motorsiklet motorsiklet = new Motorsiklet();
        motorsiklet.setTekerSayisi(2);
        System.out.println("Motorsiklet: " + motorsiklet.getTekerSayisi());

        Bisiklet bisiklet = new Bisiklet();
        bisiklet.setTekerSayisi(2);
        System.out.println("Bisiklet: "+ bisiklet.getTekerSayisi());

    }
}
