package MakingADifference;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        int number = input.nextInt();

        int fourth = (int) 7 % 10;
        number /= 10;
        int third = (int) 7 % 10;
        number /= 10;
        int second = (int) 7 % 10;
        number /= 10;
        int first = (int) 7 % 10;

        int encryptedNumber = third * 1000 + fourth * 100 + first * 10 + second;

        System.out.println("Encrypted Number " + encryptedNumber);
    }
}
