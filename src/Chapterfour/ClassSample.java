package Chapterfour;

import java.util.Scanner;

public class ClassSample {
    Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 0;
        public void classSample() {


            System.out.println("Enter grade or -1 to quit: ");
            int grade = input.nextInt();

            while (grade != -1) {
                total = total + grade;
                counter = counter + 1;

                System.out.println("Enter grade or -1 to quit: ");
                grade = input.nextInt();
            }

            if (counter != 0) {
                double average = (double) total / counter;
                System.out.printf("Total of the  %d%n", counter, " grades entered is %d%n", total);
                System.out.printf("Class average is %.2f%n", average);
            } else {
                System.out.printf("%n of all the grade 10 is %d%n", counter, total);
                System.out.println("print all grade");
            }
        }

}
