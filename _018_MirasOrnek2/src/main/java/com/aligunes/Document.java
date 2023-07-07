package com.aligunes;

import java.util.Date;

public class Document {

    private String[] authors;
    private Date date;

    public String[] getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }

    public void addAuthor(String name){
        System.out.println("Author name");
    }


}
