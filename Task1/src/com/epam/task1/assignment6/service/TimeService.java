package com.epam.task1.assignment6.service;

import com.epam.task1.assignment6.entity.PassageOfTime;
import com.epam.task1.assignment6.exception.TimeException;

public class TimeService {
    public PassageOfTime calcFromSeconds(int secondsAtAll) throws TimeException {
        int hours = 0, minutes = 0, seconds = 0;

        hours = Math.floorDiv(secondsAtAll, 3600);
        minutes = Math.floorDiv(secondsAtAll - 3600 * hours, 60);
        seconds = secondsAtAll - 3600 * hours - 60 * minutes;

        return new PassageOfTime(hours, minutes, seconds);
    }
}
