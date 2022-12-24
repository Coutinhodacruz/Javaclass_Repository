package CharpterTwo;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class ClubAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 1;
        int gradeCounter = 1;


        System.out.println("Enter grade or  -1 to quit: ");
        int grade = input.nextInt();
        while (grade != 1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            System.out.println("Enter grade or -1 to quit: ");
            gradeCounter = input.nextInt();
        }
        if (gradeCounter != 1){
            double average = (double)  total / gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is%d%n",gradeCounter,total);
            System.out.printf("Class average is %.2f%%n",average);
        }
        else {
            System.out.println("print all grade");
        }
    }

}





