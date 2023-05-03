package exercise1;

import java.util.Scanner;

//Write an application that will read diameter of a circle (variable of type float) and
//calculate perimeter of given circle.
//Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        float diameter =scanner.nextFloat();
        System.out.println(calculatePerimeter(diameter));
    }


    public static double calculatePerimeter(float diameter){
        double perimeter = 2* Math.PI*diameter;
        return perimeter;
    }
}
