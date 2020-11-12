package com.epam.task1.assignment10.service;

import java.util.ArrayList;
import java.util.List;

public class MathService {
    public List<double[]> calcFunction(double a, double b, double h) {
        List<double[]> data = new ArrayList<double[]>();
        int i = 0;
        for (double j = a; j < b + h; j += h) {
            data.add(new double[]{j,Math.tan(j)});
            i++;
        }
        return data;
    }
}
