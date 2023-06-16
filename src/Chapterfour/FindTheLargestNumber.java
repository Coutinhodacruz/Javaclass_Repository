package Chapterfour;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest = 0;

        while (counter <= 10){
            System.out.println("Enter a number ");
            int number = input.nextInt();
            if (number > largest){
                largest = number;
            }
            counter++;
        }
        System.out.println("The largest number is: " + largest);


    }

}
