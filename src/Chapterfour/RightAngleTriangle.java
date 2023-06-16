package Chapterfour;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the base of the triangle (1-10): ");
        int baseLength = input.nextInt();

        if (baseLength < 1 || baseLength > 10){
            System.out.println("Invalid input base length must be between 1 and 10: ");

        }else {
            StringBuilder triangle = new StringBuilder(" ");
            for (int row = 1; row <= baseLength; row++) {
                int column = 1;
                while (column < row) {
                    triangle.append("*");
                    column++;
                }
                triangle.append("\n");
            }
            System.out.println(triangle);
        }

    }
}
