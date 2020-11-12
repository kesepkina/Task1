package com.epam.task1.assignment5.service;


import com.epam.task1.assignment5.exception.NumberServiceException;

public class NumberService {
    public boolean isPerfectNumber(int number) throws NumberServiceException {
        int sumOfDivisors = 0;
        if (isNaturalNumber(number)){
            for(int i = 1; i < number ; i++){
                if (number % i == 0) sumOfDivisors += i;
            }
        } else {
            throw new NumberServiceException();
        }
        return number == sumOfDivisors;
    }

    private boolean isNaturalNumber(int number){
        return number > 0;
    }
}
