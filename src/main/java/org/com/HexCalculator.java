package org.com;

import static java.lang.Integer.toHexString;

public class HexCalculator extends Calculator {
    @Override
    public String add(String number1, String number2) {
        int b1 = Integer.parseInt(number1, 16);
        int b2 = Integer.parseInt(number2, 16);
        int result = b1 + b2;
        return toHexString(result).toUpperCase();
    }
    @Override
    public String sub(String number1, String number2) {
        int b1 = Integer.parseInt(number1, 16);
        int b2 = Integer.parseInt(number2, 16);
        int result = b1 - b2;
        return toHexString(result).toUpperCase();
    }
    @Override
    public String mult(String number1, String number2) {
        int b1 = Integer.parseInt(number1, 16);
        int b2 = Integer.parseInt(number2, 16);
        int result = b1 * b2;
        return toHexString(result).toUpperCase();
    }
    @Override
    public String div(String number1, String number2) {
        int b1 = Integer.parseInt(number1, 16);
        int b2 = Integer.parseInt(number2, 16);
        int result = b1 / b2;
        return toHexString(result).toUpperCase();
    }
}
