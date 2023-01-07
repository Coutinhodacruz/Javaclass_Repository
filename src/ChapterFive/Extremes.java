package ChapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        int Maximum = 0;
        int Minimum = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of numbers you want to compare");
        int userChoice = scanner.nextInt();

         for (int count = 1; count <= userChoice; count++) {
            System.out.println("Enter the number");
            int num = scanner.nextInt();
            if (num > Maximum){
                Maximum = num;
            } else if (Minimum < num) {
                Minimum = num;
            }

        }
        System.out.println("Maximum number" + Maximum);

        System.out.println("Minimum number" + Minimum);

    }
}
