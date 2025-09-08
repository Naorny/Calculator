package calculator;

class DecimalCalculator extends Calculator {

    @Override
    public String add(String number1, String number2) {
        int result = Integer.parseInt(number1) + Integer.parseInt(number2);
        return Integer.toString(result);
    }

    @Override
    public String sub(String number1, String number2) {
        int result = Integer.parseInt(number1) - Integer.parseInt(number2);
        return Integer.toString(result);
    }

    @Override
    public String mult(String number1, String number2) {
        int result = Integer.parseInt(number1) * Integer.parseInt(number2);
        return Integer.toString(result);
    }

    @Override
    public String div(String number1, String number2) {
        int result = Integer.parseInt(number1) / Integer.parseInt(number2);
        return Integer.toString(result);
    }

}
