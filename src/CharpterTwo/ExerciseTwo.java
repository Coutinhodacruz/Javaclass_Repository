package CharpterTwo;

import java.util.Scanner;
    public class ExerciseTwo {

    public static class Payroll{
        public static void main(String[] arg){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an Integer");
            int b=input.nextInt();
            System.out.print("Enter an Integer");
            int c=input.nextInt();
            int a=b*c;
            System.out.print("The product amount is"+a);
            //This program performs a simple payroll calculation.
        }
    }
}
