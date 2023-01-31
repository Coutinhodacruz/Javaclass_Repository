package StudentGrade;

import java.util.Scanner;

public class StudentGrade {
    Scanner input = new Scanner(System.in);

    private int[] studentGrade = {55,66,12,77,20,90,34,58,10};

    int studentGradeCounter;

    int grade;

    public void setStudentGrade(int[] studentGrade){
        this.studentGrade = studentGrade;
        for (studentGradeCounter = 0; studentGradeCounter < studentGrade.length; studentGradeCounter++){
            System.out.printf("%s%d%n", "Enter the grades for subject",studentGradeCounter + 1);
            grade = input.nextInt();
            if (grade > 0 && grade <= 100){
                studentGrade[studentGradeCounter] = grade;
            }else
                System.out.println("Enter a valid input");
        }

    }

    public void Average(){
        double average = 0;
        int totalOfGrades = 0;
        for (int grade : studentGrade){
            totalOfGrades += grade;
            average = (double) totalOfGrades / studentGrade.length;

        }
        System.out.println("The average of the scores is " + average);
    }

    public int getMaximum(int[] studentGrade){
        int maximum = studentGrade[0];
        for (int grade : studentGrade){
            if (grade > maximum)
                maximum = grade;
        }
        return maximum;
    }

    public  int getMinimum(int[] studentGrade){
        int minimum = studentGrade[0];
        for (int grade : studentGrade){
            if (grade < minimum){
                minimum = grade;
            }
        }
        return minimum;
    }
}
