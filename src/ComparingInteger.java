import java.util.Scanner;

public class ComparingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int num1= input.nextInt();
        int num2 = 100;
        if (num1 > num2)
            System.out.println("num1 is greater than num2");
        if (num1 < num2)
            System.out.println("num1 is less than num2");
        if (num1 == num2)
            System.out.println("num1 = num2");
    }
}
