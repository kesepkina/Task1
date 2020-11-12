package com.epam.task1.assignment6.entity;

import com.epam.task1.assignment6.exception.TimeException;

import java.util.Objects;

public class PassageOfTime {
    private int hours;
    private int minutes;
    private int seconds;
    private static final String NEGATIVE_TIME_ERROR_STRING = "Unit of time can't be negative.";

    public PassageOfTime(int hours, int minutes, int seconds) throws TimeException {
        if (isNotNegativeNumber(hours) && isNotNegativeNumber(minutes) && isNotNegativeNumber(seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            throw new TimeException(NEGATIVE_TIME_ERROR_STRING);
        }
    }

    public PassageOfTime() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) throws TimeException {
        if (isNotNegativeNumber(hours)) {
            this.hours = hours;
        } else {
            throw new TimeException(NEGATIVE_TIME_ERROR_STRING);
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) throws TimeException {
        if (isNotNegativeNumber(minutes)) {
            this.minutes = minutes;
        } else {
            throw new TimeException(NEGATIVE_TIME_ERROR_STRING);
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) throws TimeException {
        if (isNotNegativeNumber(seconds)) {
            this.seconds = seconds;
        } else {
            throw new TimeException(NEGATIVE_TIME_ERROR_STRING);
        }
    }

    private boolean isNotNegativeNumber(int number) {
        return number > -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassageOfTime that = (PassageOfTime) o;
        return hours == that.hours &&
                minutes == that.minutes &&
                seconds == that.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }

}
