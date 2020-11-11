package com.epam.task1.assignment1.main;

import com.epam.task1.assignment1.report.NumberReport;
import com.epam.task1.assignment1.service.NumberService;

public class Main {
    public static void main(String[] args){
        int number = 9864463;
        NumberService service = new NumberService();
        int lastDigit = service.lastDigitOfSquare(number);
        NumberReport report = new NumberReport();
        report.lastDigitOfSquare(number, lastDigit);
    }
}
