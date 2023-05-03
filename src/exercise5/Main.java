package exercise5;

import java.util.Scanner;

public class Main {
    public static Scanner scanner =new Scanner(System.in);
    public static int number=scanner.nextInt();
    public static void main(String[] args) {
        System.out.println(findPrimeNumber(number));
    }
    public static String findPrimeNumber(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
         return num + " is a prime number.";
        else
           return num+" is not a prime number.";
    }
}

