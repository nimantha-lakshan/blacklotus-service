package com.blacklotus.service.exceptions;

public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException() {
        super("Unauthorized Request, please login to continue.");
    }
}
