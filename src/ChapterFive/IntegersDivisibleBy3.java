package ChapterFive;

import java.util.Scanner;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        System.out.println("Enter How many number you to sum");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter number");
            int num = scanner.nextInt();
            if (num >= 1 && num <= 30){
                int divide = num % 3;
                if (divide == 0){
                    System.out.println("The number is Divisible by 3");
                    total += num;
                }else{
                    System.out.println("The number is not Divisible by 3");
                }
            }
        }
        System.out.println(total);
        }
    }
