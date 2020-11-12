package com.epam.task1.assignment4.service;

import com.epam.task1.assignment4.exception.NumberServiceException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class NumberServiceTest {
    @Test
    public void thereIsMinTwoEvenTest(){
        NumberService service = new NumberService();

        try {
            boolean actual = service.thereIsMinTwoEven(1, 3, 15, 12459, 2);
            assertSame(actual, false);
        } catch (NumberServiceException e) {
            e.printStackTrace();
        }

    }
}
