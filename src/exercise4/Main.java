package exercise4;

import java.util.Scanner;

//Write an application that takes a positive number from the user (type int) and writes all
//numbers from 1 to the given number, each on the next line, with the following changes:
//● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
//● in place of numbers divisible by 7, instead of a number the program should write
//"Buzz"
//● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"
public class Main {
    public static Scanner scanner =new Scanner(System.in);
    public static int number=scanner.nextInt();
    public static void main(String[] args) {
        System.out.println( findFizzBuzz(number)) ;
    }

    public static String findFizzBuzz(int number) {
            if (number % 3 == 0 && number % 5 == 0) {
                return "Found fizzbuzz number";
            } else if (number % 3 == 0) {
                return "Found fizz number";
            } else if (number % 5 == 0) {
                return "Found buzz number";
            } else {
                return "Not a valid number";
            }
        }
}
