package com.epam.task1.assignment8.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MathServiceTest {
    MathService service = new MathService();

    @Test
    public void calcFunctionTest(){

        double expected = 5;
        double actual = service.calcFunction(4);
        assertEquals(actual, expected);
    }
}
