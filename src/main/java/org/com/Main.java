package org.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Calculator decimalCalculator = new DecimalCalculator();

        System.out.print("Please choose what calculator will you use(decimal, binary, hex): ");
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        System.out.println("Enter number1:");
        String number1 = scan.nextLine();
        System.out.println("Enter number2:");
        String number2 = scan.nextLine();

        switch (type) {
            case "decimal":
                Calculator decimalCalculator = new DecimalCalculator();

                System.out.println("Choose math symbol(+, -, *, /): ");
                String symbol = scan.nextLine();
                //System.out.println("Decimal Calculator: ");
                switch (symbol) {
                    case "+":
                        System.out.println( number1 + " + " + number2 + " = " + decimalCalculator.add(number1, number2));
                        break;
                    case "-":
                        System.out.println(number1 + " - " + number2 + " = " + decimalCalculator.sub(number1, number2));
                        break;
                    case "*":
                        System.out.println(number1 + " * " + number2 + " = " + decimalCalculator.mult(number1, number2));
                        break;
                    case "/":
                        System.out.println(number1 + " / " + number2 + " = " + decimalCalculator.div(number1, number2));
                        break;
                    default:
                        System.out.println("Error");

                }
        }
    }
}