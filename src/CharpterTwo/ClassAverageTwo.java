package CharpterTwo;

import java.util.Scanner;

public class ClassAverageTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total =1;
        int gradeCounter = 1;


        System.out.println("Enter grade or  -1 to quit: ");
        int grade = input.nextInt();
        while (grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.println("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        if (gradeCounter == 10){
            double average = (double)  total / gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is%d%n",gradeCounter,total);
            System.out.printf("Class average is %.2f%%n",average);
        }
        else {
            System.out.printf("%n of all the grade 10 is %d%n",gradeCounter,total);
            System.out.println("print all grade");
        }
    }

}





