package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalCalculatorTest {
private DecimalCalculator decimalCalculator;

    @BeforeEach
    public void setup() {

    }

    @Test
    void add() {
        Calculator decimalCalculator = new DecimalCalculator();
        int actual = Integer.parseInt(decimalCalculator.add("20", "5"));
        int expected = Integer.parseInt("25");
        assertEquals(expected, actual, "Incorrect numbers");
    }

    @Test
    void sub() {
        Calculator decimalCalculator = new DecimalCalculator();
        int actual = Integer.parseInt(decimalCalculator.sub("20", "5"));
        int expected = Integer.parseInt("30");
        assertEquals(expected, actual, "Incorrect numbers");
    }

    @Test
    void mult() {
        Calculator decimalCalculator = new DecimalCalculator();
        int actual = Integer.parseInt(decimalCalculator.mult("20", "5"));
        int expected = Integer.parseInt("100");
        assertEquals(expected, actual, "Incorrect numbers");
    }

    @Test
    void div() {
        Calculator decimalCalculator = new DecimalCalculator();
        int actual = Integer.parseInt(decimalCalculator.div("20", "5"));
        int expected = Integer.parseInt("30");
        assertEquals(expected, actual, "Incorrect numbers");
    }
}