package com.epam.task1.assignment2.exception;

public class MonthException extends Exception {
    public MonthException() {
    }

    public MonthException(String message) {
        super(message);
    }

    public MonthException(String message, Throwable cause) {
        super(message, cause);
    }

    public MonthException(Throwable cause) {
        super(cause);
    }
}
