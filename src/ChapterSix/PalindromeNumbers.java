package ChapterSix;

import java.util.Scanner;

public class PalindromeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter a number");
        num = input.nextInt();

        checkPalindrome(num);

    }
    private static void checkPalindrome(int original) {

        int reverseNum = 0;
        int tempOriginal = original;

        while (tempOriginal > 0) {
            int lastDigit = tempOriginal % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            tempOriginal = tempOriginal / 10;
            if (original <= reverseNum){
                tempOriginal = original / reverseNum;
                System.out.println(original == reverseNum);
            }
        }

        System.out.println(tempOriginal != reverseNum);

    }

}






















