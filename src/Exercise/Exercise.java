package Exercise;

import java.util.Scanner;

public class Exercise {

    int num1;
    int num2;

    Scanner input = new Scanner(System.in);

    public void exercise(){

        System.out.println("Enter First Integer");
        num1 = input.nextInt();

        System.out.println("Enter Second Integer");
        num2 = input.nextInt();

        int sum = num1 + num2;

        int divide = num1 / num2;

        int sub = num1 - num2;

        int multiply = num1 * num2;

        int modulo = num1 % num2;

        System.out.println("Sum " + sum);
        System.out.println("Divide " +divide);
        System.out.println("Sub " + sub);
        System.out.println("Multiply " + multiply);
        System.out.println("Modulo " + modulo);



    }

}
