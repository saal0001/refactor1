package com.example.refactor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.add(first, second);
        Assertions.assertEquals(3.0, result, 0.1);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.subtract(first, second);
        Assertions.assertEquals(-1.0, result, 0.1);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.multiply(first, second);
        Assertions.assertEquals(2.0, result, 0.1);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.divide(first, second);
        Assertions.assertEquals(0.5, result, 0.1);
    }
}
