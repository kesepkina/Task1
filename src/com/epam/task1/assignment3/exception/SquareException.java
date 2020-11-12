package com.epam.task1.assignment3.exception;

public class SquareException extends Exception {
    public SquareException() {
    }

    public SquareException(String message) {
        super(message);
    }

    public SquareException(String message, Throwable cause) {
        super(message, cause);
    }

    public SquareException(Throwable cause) {
        super(cause);
    }
}
