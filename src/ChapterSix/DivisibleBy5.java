package ChapterSix;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        System.out.println("Enter how many number ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter number");
            int num = input.nextInt();
            if (num > 10){
                int divide = num % 5;
                if (divide == 0){
                    System.out.println("The number is divisible by 5");
                    total += num;
                }else {
                    System.out.println("The number is not divisible 5");
                }
            }
        }
        System.out.println(total + count);

    }
}
