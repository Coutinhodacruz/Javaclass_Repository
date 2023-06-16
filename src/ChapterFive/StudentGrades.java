package ChapterFive;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        for (int grade = 1; grade <= 5; grade++) {
            System.out.println("Enter student " + grade + " name: ");
            String name = input.nextLine();
            System.out.println("Enter student " + grade+ " grade (A, B, C, or D): ");

            int studentGrade = input.nextInt();

            switch (studentGrade){
                case 'A':
                    aCount++;
                    break;
                case 'B':
                    bCount++;
                    break;
                case 'C':
                    cCount++;
                    break;
                case 'D':
                    dCount++;
                    break;
                default:
                    System.out.println("Invalid grade entered for student " + grade + ".");
                    grade--;
                    break;
            }
        }
        System.out.println("Grade Distributor: \nA: "+ aCount + "\nB" + bCount + "\nC" + cCount + "\nD" + dCount);
    }
}
