package com.epam.task1.assignment2.service;

import com.epam.task1.assignment2.entity.Month;
import com.epam.task1.assignment2.entity.Year;

public class MonthService {
    private static final int FOUR_HUNDRED = 400;
    private static final int FOUR = 4;
    private static final int ONE_HUNDRED = 100;

    public int numberOfDays(Month month, Year year) {
        int numberOfDays;
        numberOfDays = switch (month.getAsNumber()) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeap(year) ? 29 : 28;
            default -> 0;
        };
        return numberOfDays;
    }

    private boolean isLeap(Year year) {
        int yearNumber = year.getAsNumber();
        boolean isLeap;
        isLeap = (yearNumber % FOUR_HUNDRED == 0) || (yearNumber % FOUR == 0 && yearNumber % ONE_HUNDRED != 0);
        return isLeap;
    }
}
