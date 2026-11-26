package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(15.0, calc.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5.0, calc.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50.0, calc.multiply(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calc.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }
}