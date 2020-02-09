package com.blacklotus.service.exceptions;

public class DuplicateValuesException extends RuntimeException {

    public DuplicateValuesException() {
        super();
    }

    public DuplicateValuesException(String message) {
        super(message);
    }

}
