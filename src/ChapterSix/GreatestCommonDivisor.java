package ChapterSix;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the first number to find GCD");
        num1 = input.nextInt();
        System.out.println("Enter the second number to find GCD");
        num2 = input.nextInt();


        while (num1 != num2){
            if (num1 > num2){
                num1 = num1 * num2;
            }else
                num2 = num2 - num1;
        }
        System.out.printf("GCD number is: %d",num2);


    }
}
