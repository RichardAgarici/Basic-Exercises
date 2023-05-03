package exercise8;

import java.util.Scanner;

//Write an application that implements a simple calculator. The application should:
//a. read first number (type float)
//b. read one of following symbols: + - / *
//c. read second number (type float)
//d. return a result of given mathematical operation
//If the user provides a symbol other than supported, the application should print "Invalid
//symbol". If the entered action cannot be implemented (i.e. it is inconsistent with the
//principles of mathematics), the application should print "Cannot calculate".
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(simpleCalculator());

    }

    public static String simpleCalculator() {
        float number1 = scanner.nextFloat();
        String i = scanner.next();
        float number2 = scanner.nextFloat();
        switch (i) {
            case "+" -> {
                return "The result is " + (number1 + number2);
            }
            case "-" -> {
                return "The result is " + (number1 - number2);
            }
            case "*" -> {
                return "The result is " + (number1 * number2);
            }
            case "/" -> {
                if (number2 > 0) {
                    return "The result is " + (number1 / number2);
                } else {
                    return "You cannot divide to 0";
                }
            }
            default -> {
                return "Not a valid operator";
            }
        }

    }
}