package StudentGrade;

import java.util.Scanner;

public class StudentGradeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrade studentGrade = new StudentGrade();
        System.out.println("Enter how many subject do you want");
        int numberSubject = scanner.nextInt();
        int[] studentGrades = new int[numberSubject];
        studentGrade.setStudentGrade(studentGrades);
        studentGrade.Average();
        System.out.printf("%s%d%n", "The maximum grade is ", studentGrade.getMaximum(studentGrades));
        System.out.printf("%s%d%n", "The minimum grade is ", studentGrade.getMinimum(studentGrades));

    }
}

