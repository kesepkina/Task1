package com.epam.task1.assignment6.exception;

public class TimeException extends Exception {
    public TimeException() {
    }

    public TimeException(String message) {
        super(message);
    }

    public TimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeException(Throwable cause) {
        super(cause);
    }
}
