package com.epam.task1.assignment10.main;

import com.epam.task1.assignment10.report.MathReport;
import com.epam.task1.assignment10.service.MathService;

public class Main {
    public static void main(String[] args){
        MathService service = new MathService();
        double[][] data = service.calcFunction(0.785, 9.42, 0.785 );
        MathReport report = new MathReport();
        report.showResults(data);
    }
}
