package Exercise;

import java.util.Scanner;

public class ComparingInteger {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter an Integer");
//        int num1= input.nextInt();
//        int num2 = 100;
//        if (num1 > num2){
//            System.out.println("num 1 is greater than num 2");
//        } else if (num1 < num2){
//            System.out.println("num 1 is less than num2 ");
//        }else {
//            System.out.println("num1 = num2");
//
//        }


        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int square = num * num;

        if (num + square > 100) {
            System.out.println(num + " and its square are greater than 100.");
        } else if (num + square == 100) {
            System.out.println(num + " and its square are equal to 100.");
        } else if (num + square != 100) {
            System.out.println(num + " and its square are not equal to 100.");
        } else {
            System.out.println(num + " and its square are less than 100.");
        }

    }
}




