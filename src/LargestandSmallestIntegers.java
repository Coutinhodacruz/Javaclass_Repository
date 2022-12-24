import java.util.Scanner;

public class LargestandSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int num1 = input.nextInt();
        System.out.println("Enter an Integer");
        int num2 = input.nextInt();
        System.out.println("Enter an Integer");
        int num3 = input.nextInt();
        System.out.println("Enter an Integer");
        int num4 = input.nextInt();
        System.out.println("Enter an Integer");
        int num5 = input.nextInt();

        int multiple = num1 * num2 * num3 * num4 * num5;
        int sum = num1 + num2 + num3 + num4 + num5;
        int divide = num1 / num2 / num3 / num4 / num5;
        if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5);
            System.out.println("num1 is greater than num2 && num3 && num4 && num5");
        if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5);
            System.out.println("num2 is greater than num1 && num3 && num4 && num5");
        if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5);
            System.out.println("num3 is greater than num1 && num2 && num4 && num5");
        if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5);
            System.out.println("num4 is greater than num1 && num2 && num3 && num5");
        if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4);
            System.out.println("num5 is greater than num1 && num2 && num3 && num4");
        if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5);
            System.out.println("num1 is less than num2 && num3 && num4 && num5");
        if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5);




    }
}
