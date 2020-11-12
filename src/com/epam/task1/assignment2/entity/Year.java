package com.epam.task1.assignment2.entity;

public class Year {
    int year;

    public Year(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Year{");
        sb.append("year=").append(year);
        sb.append('}');
        return sb.toString();
    }

}
