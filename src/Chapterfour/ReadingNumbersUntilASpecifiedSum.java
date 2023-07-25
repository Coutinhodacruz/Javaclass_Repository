package Chapterfour;

import java.util.Scanner;

public class ReadingNumbersUntilASpecifiedSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
       int counter = input.nextInt();
        int count = 0;

       while (count > counter){
           System.out.println("Enter a number ");
           int newNumber = input.nextInt();
           count+=newNumber;
       }
        System.out.println("The sum number is" + count);
    }
}
