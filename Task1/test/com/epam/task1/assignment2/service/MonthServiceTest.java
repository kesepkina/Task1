package com.epam.task1.assignment2.service;

import com.epam.task1.assignment2.entity.Month;
import com.epam.task1.assignment2.entity.Year;
import com.epam.task1.assignment2.exception.MonthException;
import com.epam.task1.assignment2.report.MonthReport;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class MonthServiceTest {
    MonthService service = new MonthService();
    MonthReport report = new MonthReport();
    @Test
    public void numberOfDaysTest(){
        try {
            int expected = 29;
            Year year = new Year(2000);
            Month month = new Month(2);
            int actual = service.numberOfDays(month, year);
            report.numberOfDaysInMonth(month, year, actual);
            assertSame(actual, expected);
        } catch (MonthException e) {
            System.err.println(e);;
        }

    }

}
