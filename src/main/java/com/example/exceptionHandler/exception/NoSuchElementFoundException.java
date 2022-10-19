package com.example.exceptionHandler.exception;

public class NoSuchElementFoundException extends RuntimeException {

    public NoSuchElementFoundException(String message){
        super(message);
    }
}
