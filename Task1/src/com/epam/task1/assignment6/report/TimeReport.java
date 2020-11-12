package com.epam.task1.assignment6.report;

import com.epam.task1.assignment6.entity.PassageOfTime;

public class TimeReport {
    public void passageOfTime(PassageOfTime passageOfTime) {
        System.out.println(passageOfTime.getHours() + " hours, " + passageOfTime.getMinutes() +
                " minutes, " + passageOfTime.getSeconds() + " seconds have gone.");
    }
}
