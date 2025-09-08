package org.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryCalculatorTest {

    @Test
    void add() {
        Calculator binaryCalculator = new BinaryCalculator();
        int actual = Integer.parseInt(binaryCalculator.add("11", "10"));
        int expected = Integer.parseInt("11");
        assertEquals(expected, actual, "Incorrect numbers");
    }

    @Test
    void sub() {
        Calculator binaryCalculator = new BinaryCalculator();
        int actual = Integer.parseInt(binaryCalculator.sub("11", "10"));
        int expected = Integer.parseInt("1");
        assertEquals(expected, actual, "Incorrect numbers");
    }

    @Test
    void mult() {
        Calculator binaryCalculator = new BinaryCalculator();
        int actual = Integer.parseInt(binaryCalculator.mult("11", "1"));
        int expected = Integer.parseInt("11");
        assertEquals(expected, actual, "Incorrect numbers");
    }

    @Test
    void div() {
        Calculator binaryCalculator = new BinaryCalculator();
        int actual = Integer.parseInt(binaryCalculator.div("11", "1"));
        int expected = Integer.parseInt("11");
        assertEquals(expected, actual, "Incorrect numbers");
    }
}