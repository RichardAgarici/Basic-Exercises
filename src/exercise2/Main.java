package exercise2;

import java.util.Scanner;

//Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
//Your application should read two variables: weight (in kilograms, type float) and height
//(in centimeters, type int). BMI should be calculated given following formula:
//The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal
//values. Your program should write "BMI optimal" or "BMI not optimal", according to the
//assumptions above
public class Main {
    public static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your weight in kilograms");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height in centimeters");
        int height =scanner.nextInt();
        String m = calculateBodyMassIndex(weight, height);
        System.out.println(m);

    }

    public static String calculateBodyMassIndex(float weight, int height) {
        float index = (float) (weight / (Math.pow(height,2)));
        if(index<18.5 || index> 24.9){
            return "BMI not optimal";
        } else {
            return "BMI Optimal";
        }
    }
}
