package com.blacklotus.service.exceptions;

public class ParameterNotFoundException extends NotFoundException {

    public ParameterNotFoundException() {
        super();
    }

    public ParameterNotFoundException(String message) {
        super(message);
    }
}
