package exercise7;
//Write an application that will take a positive number from the user (type int) and
//calculate the Fibonacci number at the indicated index. For example, if the number equals
//5, your program should print the fifth Fibonacci number. In Fibonacci sequence, each
//number is the sum of the two preceding ones. For example, the first few Fibonacci
//numbers are:
public class Main {
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }
    public static void main(String args[]){
        int count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }
}