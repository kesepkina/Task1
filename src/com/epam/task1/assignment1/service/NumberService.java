package com.epam.task1.assignment1.service;

public class NumberService {
    public int lastDigitOfSquare(int number) {
        int lastDigit = lastDigit(number);
        int lastDigitOfSquare;
        lastDigitOfSquare = switch (lastDigit) {
            case 1, 9 -> 1;
            case 2, 8 -> 4;
            case 3, 7 -> 9;
            case 4, 6 -> 6;
            case 5 -> 5;
            default -> 0;
        };
        return lastDigitOfSquare;
    }

    private int lastDigit(int number) {
        return number % 10;
    }
}
