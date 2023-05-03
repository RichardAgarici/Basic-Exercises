package exercise6;

import java.util.Scanner;

public class Main {
    public static Scanner scanner =new Scanner(System.in);
    public static int number =scanner.nextInt();
    public static void main(String[] args) {
        System.out.println(harmonicNumber(number));
    }
    public static double harmonicNumber(int number){
        double harmonic = 0;
        if(number > 1) {
            for (int i = 1; i<=number; i++) {
                double j = ((double) 1 /i);
                harmonic+=j;
            }
            return harmonic;
        }
        else {
            return -1;
        }
    }
}
