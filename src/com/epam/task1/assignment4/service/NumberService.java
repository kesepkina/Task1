package com.epam.task1.assignment4.service;

import com.epam.task1.assignment4.exception.NumberServiceException;

public class NumberService {
    public boolean thereIsMinTwoEven(int... numbers) throws NumberServiceException {
        int numberOfEven = 0;
        if (numbers.length > 2){
            for(int number : numbers){
                if (isEven(number)) numberOfEven++;
            }
        } else {
            throw new NumberServiceException("To less numbers.");
        }
        return numberOfEven > 1;
    }

    private boolean isEven(int number){
        return number % 2 == 0;
    }
}
