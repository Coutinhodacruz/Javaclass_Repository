package Chapterfour;

import java.util.Scanner;

public class ComparatorNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();
        
        if (firstNumber == secondNumber){
            System.out.println(0);
        } else if (firstNumber > secondNumber) {
            System.out.println(1);
        }else {
            System.out.println(-1);
        }
    }
}
