package Exercise;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int numb1 = input.nextInt();
        System.out.println("Enter an Integer");
        int num2 = input.nextInt();

        int squareOfNum1 = numb1 * numb1;
        int squareOfNum2 = num2 * num2;
        int sumOfSquare = squareOfNum1 + squareOfNum2;
        System.out.println(squareOfNum1);
        System.out.println(squareOfNum2);
        System.out.println(sumOfSquare);






    }
}
