package com.aligunes.v2;

import java.util.ArrayList;
import java.util.List;

public class ListManager <T>{

    // yukarıdaki T kısmına ne gelirse aşağıya alacak. integer geldiyse aşağıya da integer gibi.
    private ArrayList<T> benimListem = new ArrayList<>();

    public void listeyeEkle(T eklenecekVeri){
        this.benimListem.add(eklenecekVeri); // istersen this. koymadan yazabilirsin
    }

    public ArrayList<T> ListeyiGetir(){
        return this.benimListem;  // istersen this. koymadan yazabilirsin
    }
}
