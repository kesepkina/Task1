package com.epam.task1.assignment10.main;

import com.epam.task1.assignment10.entity.Data;
import com.epam.task1.assignment10.report.MathReport;
import com.epam.task1.assignment10.service.MathService;

public class Main {
    public static void main(String[] args) {
        MathService service = new MathService();
        MathReport report = new MathReport();

        Data arguments = service.calcInitialData(Math.PI / 4, 4 * Math.PI, Math.PI / 2);
        Data results = service.calcFunction(arguments);
        report.showResults(arguments, results);
    }
}
