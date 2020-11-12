package com.epam.task1.assignment2.entity;

import com.epam.task1.assignment2.exception.MonthException;

public class Month {
    private int asNumber;

    public Month(int asNumber) throws MonthException {
        if (checkNumber(asNumber)) {
            this.asNumber = asNumber;
        } else {
            throw new MonthException("not existing number of month");
        }
    }

    public int getAsNumber() {
        return asNumber;
    }

    public void setAsNumber(int asNumber) throws MonthException {
        if (checkNumber(asNumber)) {
            this.asNumber = asNumber;
        } else {
            throw new MonthException("not existing number of month");
        }
    }

    private boolean checkNumber(int number) {
        return number > 0 && number < 13;
    }
}
