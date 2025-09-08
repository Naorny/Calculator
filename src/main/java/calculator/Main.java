package calculator;



import java.util.Objects;
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
                String symbol_1 = scan.nextLine();
                System.out.println("Decimal Calculator: ");
                switch (symbol_1) {
                    case "+":
                        System.out.println(number1 + " + " + number2 + " = " + decimalCalculator.add(number1, number2));
                        break;
                    case "-":
                        System.out.println(number1 + " - " + number2 + " = " + decimalCalculator.sub(number1, number2));
                        break;
                    case "*":
                        System.out.println(number1 + " * " + number2 + " = " + decimalCalculator.mult(number1, number2));
                        break;
                    case "/":
                        if (!Objects.equals(number2, "0")) {
                            System.out.println(number1 + " / " + number2 + " = " + decimalCalculator.div(number1, number2));
                        } else System.out.println("Error");
                        break;
                    default:
                        System.out.println("Error");

                }
            case "binary":
                Calculator binaryCalculator = new BinaryCalculator();
                System.out.println("Choose math symbol(+, -, *, /): ");
                String symbol_2 = scan.nextLine();
                System.out.println("Binary Calculator: ");
                switch (symbol_2) {
                    case "+":
                        System.out.println(number1 + " + " + number2 + " = " + binaryCalculator.add(number1, number2));
                        break;
                    case "-":
                        System.out.println(number1 + " - " + number2 + " = " + binaryCalculator.sub(number1, number2));
                        break;
                    case "*":
                        System.out.println(number1 + " * " + number2 + " = " + binaryCalculator.mult(number1, number2));
                        break;
                    case "/":
                        if (!Objects.equals(number2, "0")) {
                        System.out.println(number1 + " / " + number2 + " = " + binaryCalculator.div(number1, number2));
                        } else System.out.println("Error");
                        break;
                    default:
                        System.out.println("Error");
                }
            case "hex":
                Calculator hexCalculator = new HexCalculator();
                System.out.println("Choose math symbol(+, -, *, /): ");
                String symbol_3 = scan.nextLine();
                System.out.println("Hex Calculator: ");
                switch (symbol_3) {
                    case "+":
                        System.out.println(number1 + " + " + number2 + " = " + hexCalculator.add(number1, number2));
                        break;
                    case "-":
                        System.out.println(number1 + " - " + number2 + " = " + hexCalculator.sub(number1, number2));
                        break;
                    case "*":
                        System.out.println(number1 + " * " + number2 + " = " + hexCalculator.mult(number1, number2));
                        break;
                    case "/":
                        if (!Objects.equals(number2, "0")) {
                            System.out.println(number1 + " / " + number2 + " = " + hexCalculator.div(number1, number2));
                        } else System.out.println("Error");
                        break;
                    default:
                        System.out.println("Error");
                }
        }
    }
}