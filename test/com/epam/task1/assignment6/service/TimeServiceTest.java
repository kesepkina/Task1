package com.epam.task1.assignment6.service;

import com.epam.task1.assignment6.entity.PassageOfTime;
import com.epam.task1.assignment6.exception.TimeException;
import com.epam.task1.assignment6.report.TimeReport;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

public class TimeServiceTest {
    @Test
    public void calcFromSecondsTest(){
        TimeService service = new TimeService();
        TimeReport report = new TimeReport();

        try {
            PassageOfTime expected = new PassageOfTime(5, 45, 32);
            PassageOfTime actual = service.calcFromSeconds(20732);
            report.passageOfTime(actual);
            assertEquals(actual, expected);
        } catch (TimeException e) {
            e.printStackTrace();
        }

    }
}
