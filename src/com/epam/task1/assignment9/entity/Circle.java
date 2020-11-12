package com.epam.task1.assignment9.entity;

import com.epam.task1.assignment9.exception.CircleException;

public class Circle {
    double radius;

    public Circle(double radius) throws CircleException {
        if (checkRadius(radius)) {
            this.radius = radius;
        } else {
            throw new CircleException("Radius can't be less than 0.");
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws CircleException {
        if (checkRadius(radius)) {
            this.radius = radius;
        } else {
            throw new CircleException("Radius can't be less than 0.");
        }
    }

    private boolean checkRadius(double radius) {
        return radius > 0;
    }
}
