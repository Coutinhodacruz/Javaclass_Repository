package CharpterTwo;

import java.util.Scanner;

public class BitFlipper {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int userInput = input.nextInt();

        if(userInput==0) System.out.println("Balusi");

        if (userInput==1) System.out.println("Faruk");

    }
}
