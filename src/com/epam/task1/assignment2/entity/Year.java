package com.epam.task1.assignment2.entity;

public class Year {
    private int asNumber;

    public Year(int asNumber) {
        this.asNumber = asNumber;
    }

    public int getAsNumber() {
        return asNumber;
    }

    public void setAsNumber(int asNumber) {
        this.asNumber = asNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Year{");
        sb.append("year=").append(asNumber);
        sb.append('}');
        return sb.toString();
    }

}
