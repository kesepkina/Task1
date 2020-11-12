package com.epam.task1.assignment5.exception;

public class NumberServiceException extends Exception {
    public NumberServiceException() {
    }

    public NumberServiceException(String message) {
        super(message);
    }

    public NumberServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberServiceException(Throwable cause) {
        super(cause);
    }
}
