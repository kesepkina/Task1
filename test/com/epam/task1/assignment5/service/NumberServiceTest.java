package com.epam.task1.assignment5.service;

import com.epam.task1.assignment4.exception.NumberServiceException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class NumberServiceTest {
    @Test
    public void isPerfectNumberTest() {
        NumberService service = new NumberService();

        try {
            boolean isPerfectNumber = service.isPerfectNumber(496);
            assertSame(isPerfectNumber, true);
        } catch (NumberServiceException e) {
            e.printStackTrace();
        }

    }
}
