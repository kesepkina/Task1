package com.epam.task1.assignment4.service;

import com.epam.task1.assignment4.exception.NumberServiceException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {
    NumberService service = new NumberService();

    @Test
    public void thereIsMinTwoEvenTest1() {
        try {
            boolean actual = service.thereIsMinTwoEven(1, 3, 15, 12459, 2);
            assertFalse(actual);
        } catch (NumberServiceException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void thereIsMinTwoEvenTest2() {
        try {
            boolean actual = service.thereIsMinTwoEven(1, 3, 15, 12459, 2, 4, 8, 890);
            assertTrue(actual);
        } catch (NumberServiceException e) {
            e.printStackTrace();
        }
    }
}
