package Chapterfour;

import java.util.Scanner;

public class DistanceBetweenTwoPoint {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the x coordinate of the first point: ");
        int x1 = input.nextInt();
        System.out.println("Enter the y coordinate of the first point: ");
        int y1 = input.nextInt();
        System.out.println("Enter the x coordinate of the second point: ");
        int x2 = input.nextInt();
        System.out.println("Enter the y coordinate of the second point: ");
        int y2 = input.nextInt();


        if (x1 == x2){
            System.out.println("The points are on a vertical line: ");
        } else if (y1 == y2) {
            System.out.println("The point are on a horizontal line: ");

        }else {
            System.out.println("The line are not on a perpendicular to an axis: ");
        }

    }
}
