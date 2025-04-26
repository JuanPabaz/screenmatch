package com.jpproject.screenmatch.excepciones;

public class ConversionRuntimeException extends RuntimeException {
    private String message;

    public ConversionRuntimeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
