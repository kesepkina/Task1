package com.epam.task1.assignment3.main;

import com.epam.task1.assignment3.entity.Square;
import com.epam.task1.assignment3.exception.SquareException;
import com.epam.task1.assignment3.report.SquareReport;
import com.epam.task1.assignment3.service.GeometryService;

public class Main {
    public static void main(String[] args) {
        GeometryService service = new GeometryService();
        SquareReport report = new SquareReport();

        double areaOfDescribedSquare = 14;
        try {
            Square describedSquare = service.buildSquareFromArea(areaOfDescribedSquare);
            Square inscribedSquare = service.inscribedSquare(describedSquare);
            double areaOfInscribedSquare = service.areaOfSquare(inscribedSquare);
            report.areaOfInscribedSquare(areaOfInscribedSquare);
        } catch (SquareException e) {
            e.printStackTrace();
        }
    }
}
