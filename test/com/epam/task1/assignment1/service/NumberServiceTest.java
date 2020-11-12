package com.epam.task1.assignment1.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {
    @Test
    public void findClosesPointTest() {
        int expected = 1;
        int number = 9864461;
        NumberService service = new NumberService();
        int actual = service.lastDigitOfSquare(number);
        assertSame(actual, expected);
    }
}
