package exercise9;

import java.util.Scanner;

//Write an application that will take a positive number from the user (type int) and draw a
//wave with a given length and height of 4 lines, according to the following example (fill
//empty spaces with spaces):
public class Main {
    public static void main(String[] args) {

        String path;
        int noOfTimes;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the pattern to print : ");
        path = scanner.nextLine();

        System.out.print("Enter number of times it should get printed : ");
        noOfTimes = scanner.nextInt();

        int spaceBeforePattern = 0;
        int spaceAfterPattern = 2 * noOfTimes - 3;

        System.out.println();

        for (
                int i = 1;
                i <= noOfTimes; i++) {

            for (int j = 1; j <= spaceBeforePattern; j++) {
                System.out.print(" ");
            }

            System.out.print(path);

            for (int k = 1; k <= spaceAfterPattern; k++) {
                System.out.print(" ");
            }

            if (i < noOfTimes) {
                System.out.print(path);
            }

            System.out.println();

            spaceAfterPattern = spaceAfterPattern - 2;
            spaceBeforePattern = spaceBeforePattern + 1;
        }
    }
}
