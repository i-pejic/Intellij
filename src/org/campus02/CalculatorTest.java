package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator myCalculator;
    String expectedName;

    @BeforeEach
    void setUp() {
        expectedName = "Testrechner";
        myCalculator = new Calculator(expectedName);
    }

    @Test
    void getName() {
        assertEquals(expectedName, myCalculator.getName());
    }

    @Test
    void sum() {
        double expectedResult = 1.0 + 1.0;
        Assertions.assertEquals(expectedResult, myCalculator.sum(1.0, 1.0));
    }

    @Test
    void difference() {
        double expectedResult = 1.0 - 1.0;
        Assertions.assertEquals(expectedResult, myCalculator.difference(1.0, 1.0));
    }

    @Test
    void product() {
        double expectedResult = 1.0 * 1.0;
        Assertions.assertEquals(expectedResult, myCalculator.product(1.0, 1.0));
    }

    @Test
    void quotient() {
        double expectedResult = 1.0 / 1.0;
        Assertions.assertEquals(expectedResult, myCalculator.quotient(1.0, 1.0));
    }
}