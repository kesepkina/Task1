package com.epam.task1.assignment3.entity;

import com.epam.task1.assignment3.exception.SquareException;

public class Square {
    private double sideLength;

    public Square(double sideLength) throws SquareException {
        if(checkSide(sideLength)) {
            this.sideLength = sideLength;
        } else {
            throw new SquareException("not valid sideLength");
        }
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    private boolean checkSide(double sideLength){
        return sideLength > 0;
    }
}
