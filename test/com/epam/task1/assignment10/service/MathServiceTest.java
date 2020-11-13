package com.epam.task1.assignment10.service;

import com.epam.task1.assignment10.entity.Data;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class MathServiceTest {
    MathService service = new MathService();
    private final double QUARTER_PI_TAN = Math.tan(Math.PI / 4);
    private final double MINUS_QUARTER_PI_TAN = Math.tan(-Math.PI / 4);

    @Test
    public void calcFunctionTest() {
        List<Double> expectedNumbers = new ArrayList<>();
        Collections.addAll(expectedNumbers, QUARTER_PI_TAN, MINUS_QUARTER_PI_TAN,
                QUARTER_PI_TAN, MINUS_QUARTER_PI_TAN, QUARTER_PI_TAN, MINUS_QUARTER_PI_TAN,
                QUARTER_PI_TAN, MINUS_QUARTER_PI_TAN);
        Data expected = new Data(expectedNumbers);
        Data arguments = service.calcInitialData(Math.PI / 4, 4 * Math.PI, Math.PI / 2);
        Data actual = service.calcFunction(arguments);
        assertEquals(expected, actual);
    }
}
