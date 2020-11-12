package com.epam.task1.assignment8.service;

public class MathService {
    public double calcFunction(double x) {
        double result = 0;
        if (x >= 3) {
            result = -Math.pow(x, 2) + 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) - 6);
        }
        return result;
    }
}
