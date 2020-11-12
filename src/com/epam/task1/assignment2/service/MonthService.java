package com.epam.task1.assignment2.service;

import com.epam.task1.assignment2.entity.Month;
import com.epam.task1.assignment2.entity.Year;

public class MonthService {
    public int numberOfDays(Month month, Year year) {
        int numberOfDays = 0;
        switch (month.getAsNumber()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            case 2:
                numberOfDays = isLeap(year)? 29 : 28;
                break;
        }
        return numberOfDays;
    }

    private boolean isLeap(Year year) {
        int yearNumber = year.getYear();
        return yearNumber % 400 == 0 || (yearNumber % 4 == 0 && yearNumber % 100 != 0);
    }
}
