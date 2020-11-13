package com.epam.task1.assignment10.report;

import com.epam.task1.assignment10.entity.Data;

import java.util.List;

public class MathReport {
    public void showResults(Data initialData, Data resultData) {
        List<Double> arguments = initialData.getNumbers();
        List<Double> results = resultData.getNumbers();

        System.out.println("\tArgument\tResult");
        for (int i = 0; i < arguments.size(); i++) {
            System.out.printf("\t%.3f\t\t%.3f%n", arguments.get(i), results.get(i));
        }
    }
}
