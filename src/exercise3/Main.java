package exercise3;

import java.util.Scanner;

//Write a program for solving a quadratic equation. The program should take three integers
//(coefficients of the quadratic equation a, b, c) and calculate the roots of the
//equation
// If delta ∆ comes out negative, print "Delta negative" and exit the program.
//Formulas youЀll need:
public class Main {
    public static Scanner scanner =new Scanner(System.in);
    public static int number1= scanner.nextInt();
    public static int number2= scanner.nextInt();
    public static int number3= scanner.nextInt();
    public static void main(String[] args) {
        System.out.printf("The equation is equal to %.2f", calculateX(number1,number2,number3));
    }

    public static double calculateX(int a, int b, int c) {
        System.out.println("first number is "+a+"\nsecond number is "+b+"\nthird number is "+c);
        double delta = Math.pow(a,2)-4*a*c;
        double x1= (-b-Math.sqrt(delta))/2*a;
        double x2= (-b+Math.sqrt(delta))/2*a;
        double result = (a*Math.pow(x1,2)+b*x2+c);

        if(delta<0){
            return -1;
        }
        else {
            return result;
        }
    }


}
