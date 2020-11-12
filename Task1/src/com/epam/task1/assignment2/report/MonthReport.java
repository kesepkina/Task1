package com.epam.task1.assignment2.report;

import com.epam.task1.assignment2.entity.Month;
import com.epam.task1.assignment2.entity.Year;

public class MonthReport {
    public void numberOfDaysInMonth(Month month, Year year, int numberOfDays) {
        System.out.println("There are " + numberOfDays + " days in " + month.getAsNumber()
                + ". month " + year.getYear() + ".");
    }
}
