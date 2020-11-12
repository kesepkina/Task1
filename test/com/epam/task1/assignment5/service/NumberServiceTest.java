package com.epam.task1.assignment5.service;

import com.epam.task1.assignment5.exception.NumberServiceException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

public class NumberServiceTest {
    @Test
    public void isPerfectNumberTest() {
        NumberService service = new NumberService();

        try {
            boolean isPerfectNumber = service.isPerfectNumber(496);
            assertTrue(isPerfectNumber);
        } catch (NumberServiceException e) {
            e.printStackTrace();
        }

    }
}
