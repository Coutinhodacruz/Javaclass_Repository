package ChapterSix;

import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x1,x2,y1,y2;
        double distance;

        System.out.println("Enter x1 point");
        x1 = input.nextInt();
        System.out.println("Enter y1 point");
        y1 = input.nextInt();
        System.out.println("Enter x2 point");
        x2 = input.nextInt();
        System.out.println("Enter y2 point");
        y2 = input.nextInt();

        distance = Math.sqrt((x2 - x1) * (x2 -x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance between " + "("+x1+","+y1+"),"+"("+x2+","+y2+") ===>" + distance);
    }
}
