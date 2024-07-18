package org.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexCalculatorTest {

    @Test
    void add() {
        Calculator hexCalculator = new HexCalculator();
        int actual = Integer.parseInt(hexCalculator.add("16", "1"));
        int expected = Integer.parseInt("1");
        assertEquals(expected, actual, "Error");
    }

    @Test
    void sub() {
        Calculator hexCalculator = new HexCalculator();
        int actual = Integer.parseInt(hexCalculator.sub("16", "16"));
        int expected = Integer.parseInt("0");
        assertEquals(expected, actual, "Error");
    }

    @Test
    void mult() {
        Calculator hexCalculator = new HexCalculator();
        int actual = Integer.parseInt(hexCalculator.mult("16", "1"));
        int expected = Integer.parseInt("1");
        assertEquals(expected, actual, "Error");
    }

    @Test
    void div() {
        Calculator hexCalculator = new HexCalculator();
        int actual = Integer.parseInt(hexCalculator.div("16", "1"));
        int expected = Integer.parseInt("16");
        assertEquals(expected, actual, "Error");
    }
}