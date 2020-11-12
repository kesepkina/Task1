package com.epam.task1.assignment9.exception;

public class CircleException extends Exception {
    public CircleException() {
    }

    public CircleException(String message) {
        super(message);
    }

    public CircleException(String message, Throwable cause) {
        super(message, cause);
    }

    public CircleException(Throwable cause) {
        super(cause);
    }
}
