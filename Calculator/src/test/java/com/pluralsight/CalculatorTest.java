package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_shouldReturnSumOfTwoNumbers() {
        // arrange
        int firstNumber = 2;
        int secondNumber = 4;
        int expectedResult = 6;
        Calculator cn = new Calculator();
        // act
        int actualFunctionResult = cn.add(firstNumber,secondNumber);
        // assert
        assertEquals(expectedResult, actualFunctionResult);
    }

    @Test
    void minus_shouldReturnSubOfTwoNumbers(){
        // arrange
        int firstNumber = 2;
        int secondNumber = 4;
        int expectedResult = 2;
        Calculator cn = new Calculator();
        // act
        int actualFunctionResult = cn.sub(firstNumber, secondNumber);
        // assert
        assertEquals(expectedResult, actualFunctionResult);

    }
}