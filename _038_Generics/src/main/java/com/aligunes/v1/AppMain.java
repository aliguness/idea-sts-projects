package com.aligunes.v1;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        // non generic
        List         listNonGeneric = new ArrayList();
        // generic
        List<String> listGeneric = new ArrayList<>();

        listNonGeneric.add(1);
        listNonGeneric.add(true);
        listNonGeneric.add(3.2);
        listNonGeneric.add(null);

        listGeneric.add("Burak");
        listGeneric.add("Salih");
        listGeneric.add("Abdullah");
        listGeneric.add(null);

        System.out.println(listGeneric);
        System.out.println(listGeneric.get(0));

    }
}