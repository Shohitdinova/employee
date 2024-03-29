package com.example.employees.common.exception;

public class SmsAlreadySentException extends RuntimeException{
    public SmsAlreadySentException(String message) {
        super(message);
    }
}
