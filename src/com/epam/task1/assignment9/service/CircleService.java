package com.epam.task1.assignment9.service;

import com.epam.task1.assignment9.entity.Circle;

public class CircleService {
    public double calcCircumference(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    public double calcCircleSquare(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }
}
