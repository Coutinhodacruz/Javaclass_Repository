package CharpterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number1 = input.nextInt();
        System.out.println("Enter a Number");
        int number2 = input.nextInt();
        if (number1 %number1 == number2)
            System.out.println("doubled");
        else if (number2 %number2 <= number1) {
            System.out.println("multiple");
        }else {
            System.out.println("Coutinho Dacruz");
        }
    }
}
