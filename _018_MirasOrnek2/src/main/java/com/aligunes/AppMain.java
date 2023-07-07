package com.aligunes;

public class AppMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.addAuthor("Mimar Aslan");
        System.out.println(book1.getAuthors());


    }
}