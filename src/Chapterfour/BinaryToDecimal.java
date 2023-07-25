package Chapterfour;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary integer: ");
        int binary = input.nextInt();
        int decimal = convertBinaryToDecimal(binary);
        System.out.println("The decimal equivalent of " + binary + " is " + decimal);
    }

    public static int convertBinaryToDecimal(int binary) {
        int decimal = 0;
        int count = 0;
        while (binary != 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, count);
            binary /= 10;
            count++;
        }
        return decimal;
    }
}
















































//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a binary number: ");
//        String number = input.nextLine();
//        int decimal = binaryToDecimal(number);
//        System.out.printf("The decimal equivalent of %s is %d.", number, decimal);
//    }
//
//    public static int binaryToDecimal(String binary) {
//        int decimal = 0;
//        for (int i = 0; i < binary.length(); i++) {
//            int digit = Character.getNumericValue(binary.charAt(binary.length() - i - 1));
//            decimal += digit * Math.pow(2, i);
//        }
//        return decimal;
//    }
//}
