package ChapterSix;


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long year;
        System.out.println("Enter any calender year");
        year = scanner.nextLong();

        leapOrNot(year);

    }

    private static void leapOrNot(long year) {
        if (year != 0){
            if (year % 400 == 0)
                System.out.println(year + " is a leap year");
            else if (year % 100 == 0) {
                System.out.println(year + " is not a leap year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a leap year");
            }else
                System.out.println(year + " is not a leap year");
        }
        else
            System.out.println("Year does not exit");
    }

}



















