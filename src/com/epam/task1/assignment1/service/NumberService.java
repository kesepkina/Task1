package com.epam.task1.assignment1.service;

public class NumberService {
    public int lastDigitOfSquare(int number) {
        int lastDigit = lastDigit(number);
        int lastDigitOfSquare = 0;
        switch (lastDigit) {
            case 0:
                lastDigitOfSquare = 0;
                break;
            case 1:
            case 9:
                lastDigitOfSquare = 1;
                break;
            case 2:
            case 8:
                lastDigitOfSquare = 4;
                break;
            case 3:
            case 7:
                lastDigitOfSquare = 9;
                break;
            case 4:
            case 6:
                lastDigitOfSquare = 6;
                break;
            case 5:
                lastDigitOfSquare = 5;
                break;
        }
        return lastDigitOfSquare;
    }

    private int lastDigit(int number) {
        return number % 10;
    }
}
