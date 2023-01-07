package ChapterFive;

import java.util.Scanner;

public class TheSumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int counter = 1; counter <= 100; counter++) {
            System.out.printf("%d ", counter);
            if (counter > sum)
            sum += counter;
            System.out.printf("\n\n The Sum: %d\n",sum);

        }
    }
}
