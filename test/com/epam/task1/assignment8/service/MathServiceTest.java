package com.epam.task1.assignment8.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MathServiceTest {
    @Test
    public void calcFunctionTest(){
        MathService service = new MathService();

        double expected = 5;
        double actual = service.calcFunction(4);
        assertEquals(actual, expected);
    }
}
