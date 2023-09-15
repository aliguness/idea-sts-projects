package com.aligunes.utility;

import java.util.UUID;

public class CodeGenarator {

    public static  String genarateCode(){

        String uuid = UUID.randomUUID().toString();

        String[] data = uuid.split("-");

        String newCode= "";
        int i = 0;

        while ( i< data.length){

            newCode+= data[i].charAt(0);
            i++;

        }

        return newCode;
    }
}
