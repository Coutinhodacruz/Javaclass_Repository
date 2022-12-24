package CharpterTwo;

import java.util.Scanner;

public class Pounds {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number in pounds");

        double numInPounds = input.nextDouble();

        double result = numInPounds * 0.454;

        System.out.printf("% .2f %n",result);

    }
}
