package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Let's check the multiplication process")
    void testMultiply() {
        assertEquals(21, calculator.multiply(3, 7),
                "The basic multiplication process must works");
    }
    @Test
    @DisplayName("Ensure correct subtracting of two numbers")
    void testSubtract() {
        assertEquals(5, calculator.subtract(15, 10),
                "The basic subtracting process must works");

    }
}