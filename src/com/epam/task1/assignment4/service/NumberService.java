package com.epam.task1.assignment4.service;

import com.epam.task1.assignment4.exception.NumberServiceException;

public class NumberService {
    public boolean thereIsMinTwoEven(int... numbers) throws NumberServiceException {
        int numberOfEven = 0;
        if (numbers.length > 1){
            int i = 0;
            while(i < numbers.length){
                if (isEven(numbers[i])) {
                    numberOfEven++;
                    if(numberOfEven > 1) break;
                }
                i++;
            }

        } else {
            throw new NumberServiceException("Not enough numbers.");
        }
        return numberOfEven > 1;
    }

    private boolean isEven(int number){
        return number % 2 == 0;
    }
}
