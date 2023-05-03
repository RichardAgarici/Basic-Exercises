package exercise10;

import java.util.Scanner;

//Write an application that gets one positive number (type int) from the user and calculates
//a sum of digits of the given number. Hint: to make some operations on every single digit
//of the number (digit by digit), you can calculate the remainder of dividing the number by
//10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next
//digit)
public class Main {
    public static void main(String[] args) {
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        while (number > 0) {
//finds the last digit of the given number
            digit = number % 10;
//adds last digit to the variable sum
            sum = sum + digit;
//removes the last digit from the number
            number = number / 10;
        }
//prints the result
        System.out.println("Sum of Digits: " + sum);
    }
}


