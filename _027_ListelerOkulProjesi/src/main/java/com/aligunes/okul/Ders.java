package com.aligunes.okul;

import com.aligunes.utils.Dersler;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ders {

    // fields
    private Dersler ad;
    private Ogretmen ogretmen;
    int not1;
    int not2;


    // TODO Notlar listeye çevirilecek.
    //  List<Integer> notlar;

    public int ortalama(){
        return(this.not1+ this.not2)/2;
    }


}
