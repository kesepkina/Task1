package com.epam.task1.assignment10.service;

import com.epam.task1.assignment10.entity.Data;

import java.util.ArrayList;
import java.util.List;

public class MathService {
    public Data calcFunction(Data arguments) {
        List<Double> results = new ArrayList<>();
        List<Double> initNumbers = arguments.getNumbers();
        for (double nextData : initNumbers) {
            results.add(Math.tan(nextData));
        }
        return new Data(results);
    }

    public Data calcInitialData(double a, double b, double h) {
        List<Double> data = new ArrayList<>();
        double nextData = a;
        while (nextData <= b) {
            data.add(nextData);
            nextData += h;
        }
        return new Data(data);
    }
}
