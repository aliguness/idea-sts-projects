package com.aligunes.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthManagerException extends RuntimeException{

    private final ErrorType errorType; //1

    private final String customMessage; //2

//    public AuthManagerException(ErrorType errorType){
//        this.errorType=errorType;
//    }
//
//    public AuthManagerException(ErrorType errorType, String customMessage){
//        super(customMessage);
//        this.errorType=errorType;
//    }

}
