import java.util.Scanner;

public class ArithmeticSmallestandLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int num1 = input.nextInt();
        System.out.println("Enter an Integer");
        int num2 = input.nextInt();
        System.out.println("Enter an Integer");
        int num3 = input.nextInt();

        int multiple = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        if (num1 > num2 && num1 > num3)
            System.out.println("num1 is greater than num2 && num3");
        if (num2 > num1 && num2 > num3)
            System.out.println("num2 is greater than num1 && num3");
        if (num3 > num1 && num3 > num2)
            System.out.println("num3 is greater than num1 && num2");
        if (num1 < num2 && num1 < num3)
            System.out.println("num1 is less than num2 && num3");
        if (num2 < num1 && num2 < num3)
            System.out.println("num2 is less than num1 && num3");
        if (num3 < num1 && num3 < num2)
            System.out.println("num3 is less than num1 && num2");
  //    if (num1 == num2 && num1 == num3)
   //        System.out.println("num1 = num2 && num1 = num3 ");







    }
}
