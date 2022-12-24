package CharpterTwo;

import java.util.Date;
import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        int hours,minutes,seconds;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Hours");
        hours = input.nextInt();
        System.out.println("Enter Number of Minutes");
        minutes = input.nextInt();
        System.out.println("Enter Number of Seconds");
        seconds = input.nextInt();
        Date now = new Date();
        System.out.println(now);

     }
}
