package com.epam.task1.assignment3.service;

import com.epam.task1.assignment3.entity.Square;
import com.epam.task1.assignment3.exception.SquareException;

public class GeometryService {
    public Square inscribedSquare(Square describedSquare) throws SquareException {
        double sideLength = describedSquare.getSideLength()/Math.sqrt(2);
        return new Square(sideLength);
    }

    public double areaOfSquare(Square square){
        return Math.pow(square.getSideLength(),2);
    }

    public Square buildSquareFromArea(double area) throws SquareException {
        double sideLength = Math.sqrt(area);
        return new Square(sideLength);
    }
}
