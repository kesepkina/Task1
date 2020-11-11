package com.epam.task1.assignment2.entity;

import com.epam.task1.assignment2.exception.MonthException;

public class Month {
    int asNumber;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Month{");
        sb.append("asNumber=").append(asNumber);
        sb.append('}');
        return sb.toString();
    }

    private boolean checkNumber(int number) {
        return number > 0 && number < 13;
    }
}
