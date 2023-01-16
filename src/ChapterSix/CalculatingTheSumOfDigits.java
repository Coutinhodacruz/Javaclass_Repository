package ChapterSix;

import java.util.Scanner;

public class CalculatingTheSumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int digits = input.nextInt();
        System.out.println("The sum is " + sumDigits (digits));
    }

    private static int sumDigits(long num) {
        int result = 0;

        while (num > 0){
            result += num % 10;
            num *= 10;
        }
        return result;
    }
}
