package com.aligunes.list;

import java.util.*;

public class MyLinkedList {

    public static void main(String[] args) {

        List <String> list1 = new ArrayList<>();
        list1.add("Mehmet");
        list1.add("Aysu");
        list1.add("Osman");
        list1.set(1, "Aysu");
        // list1.add
        System.out.println(list1);

        LinkedList<String> list2 = new LinkedList<>();
       // LinkedList list2 = new LinkedList<>();

        // List<String> list2 = new LinkedList<>();
        list2.add("Mehmet");
        list2.add("Aysun");
        list2.add("Osman");
        list2.set(1, "Aysu");
        System.out.println(list2);

        list2.addFirst("Orhun");
        list2.addLast("Serkan");
        list1.add("Ahmet");
      //  list2.add(12);     // hata verir çünlü 19. satırda LinkedList<String> diye zorlama yapıyoruz. illaki string olacak diye.


        Collections.sort(list2);
            for (String str: list2) {
                System.out.print(" "+str);
            }

        System.out.println(list2);

            list2.getLast();

    }
}
