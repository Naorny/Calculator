package org.com;

import static java.lang.Integer.toBinaryString;

class BinaryCalculator extends Calculator {

    @Override
    public String add(String number1, String number2) {
        int b1 = Integer.parseInt(number1, 2);
        int b2 = Integer.parseInt(number2, 2);
        int result = b1 + b2;
        return toBinaryString(result);
    }
    @Override
    public String sub(String number1, String number2) {
        int b1 = Integer.parseInt(number1, 2);
        int b2 = Integer.parseInt(number2, 2);
        int result = b1 - b2;
        return toBinaryString(result);
    }
    @Override
    public String mult(String number1, String number2) {
        int b1 = Integer.parseInt(number1, 2);
        int b2 = Integer.parseInt(number2, 2);
        int result = b1 * b2;
        return toBinaryString(result);
    }
    @Override
    public String div(String number1, String number2) {
        int b1 = Integer.parseInt(number1, 2);
        int b2 = Integer.parseInt(number2, 2);
        int result = b1 / b2;
        return toBinaryString(result);
    }

}
