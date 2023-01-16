package MakingADifference;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    SecureRandom randomNumber = new SecureRandom();

    Scanner scanner = new Scanner(System.in);

    int num1 = randomNumber.nextInt(100);
    int num2 = randomNumber.nextInt(10);

    int answer = num1 * num2;

    int failedAnswerCount;

    public void computedAssisted(){

        System.out.println("How much is " + num1 + " Times " + num2 + "?");
        int userAnswer = scanner.nextInt();
        if (userAnswer == answer){
            System.out.println("Very Good");
            System.out.println(num1 + " * " + num2 + " = " + answer);
        }
        if (userAnswer != answer) {
            do {
                System.out.println("No Please Try again");
                System.out.println("How Much is " + num1 + " Times " + num2 + "?");
                userAnswer = scanner.nextInt();

                failedAnswerCount++;

                if (failedAnswerCount == 15 && userAnswer != answer) {
                    System.out.println("wrong Try once more");
                }


            } while (userAnswer != answer);

        }
        if (failedAnswerCount < 10){
            System.out.println("Keep up The Good work");
            System.out.println("Total amount of trial is " + failedAnswerCount);
        }
        if (failedAnswerCount == 10 && userAnswer == answer){
            System.out.println("Nice Work");
            System.out.println(num1 + " * " + num2 + " = " + answer);
        }
        if (failedAnswerCount > 10 && userAnswer == answer){
            System.out.println("it took 10 trails");
            System.out.println(num1 + " * " + num2 + " = " + answer);
        }
        System.out.println(failedAnswerCount);



    }
}
