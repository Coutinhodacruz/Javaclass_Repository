package MakingADifference;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    SecureRandom randomNumber = new SecureRandom();

    Scanner scanner = new Scanner(System.in);

    int num1 = randomNumber.nextInt(10);
    int num2 = randomNumber.nextInt(10);
    int counter = 1;
    int answer = num1 * num2;

    int correctAnswer = 0;

    public void computedAssisted() {

        System.out.println("How much is " + num1 + " Times " + num2 + "?");
        while (counter <= 10) {
            int userAnswer = scanner.nextInt();
            if (userAnswer == answer) {
                System.out.println("Very Good");
                System.out.println(num1 + " * " + num2 + " = " + answer);
            }

            if (userAnswer != answer) {
                do {
                    System.out.println("No Please Try again");
                    System.out.println("How Much is " + num1 + " Times " + num2 + "?");
                    userAnswer = scanner.nextInt();

                    correctAnswer++;

                    if (correctAnswer == 15 && userAnswer != answer) {
                        System.out.println("wrong Try once more");
                    }


                } while (userAnswer != answer);

            }
            if (correctAnswer < 10) {
                System.out.println("Keep up The Good work");
                System.out.println("Total amount of trial is " + correctAnswer);
            }
            if (correctAnswer == 10 && userAnswer == answer) {
                System.out.println("Nice Work");
                System.out.println(num1 + " * " + num2 + " = " + answer);
            }
            if (correctAnswer > 10 && userAnswer == answer) {
                System.out.println("it took 10 trails");
                System.out.println(num1 + " * " + num2 + " = " + answer);
            }
            System.out.println(correctAnswer);
            break;


        }
    }

    private static final SecureRandom randomNum = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);
    private int sum;
    private int randomValue1;
    private int randomValue2;
    int correctAnswers = 0;

    public void startTest() {
        for (int counter = 0; counter <= 10; counter++) {
            generateRandomNumbers();
            displayQuestion(randomValue1, randomValue2);
            int userInput = input.nextInt();
            displayPerformanceMessage(userInput);
            while (userInput != sum) {
                reDisplayQuestion();
                userInput = input.nextInt();
                if(userInput==sum) {correctAnswers=correctAnswers + 1;}
            }
        }
        System.out.println("Number of correct answers: "+correctAnswers);
        if(correctAnswers>=7.5) {System.out.println("You are ready to go to the next level");}
        else if(correctAnswers<7.5)System.out.println("Please ask your teacher for extra help");


    }


    private void generateRandomNumbers() {
        randomValue1 = randomNum.nextInt(100);
        randomValue2 = randomNum.nextInt(100);
    }

    private void displayQuestion(int randomValue1, int randomValue2) {
        sum = randomValue1 * randomValue2;
        System.out.println("How much is " + randomValue1 + "*" + randomValue2 + " ?");
    }


    private void confirmAnswer(int userInput) {
        displayPerformanceMessage(userInput);
        while (userInput != sum) {
            reDisplayQuestion();
            userInput = input.nextInt();}
        displayQuestion(randomValue1, randomValue2);

    }
    public void setRemark(){
        int randomValue3 = randomNum.nextInt(4);
        switch (randomValue3) {
            case 0: System.out.println("Very good!");
                break;
            case 1: System.out.println("Nice work!");
                break;
            case 2: System.out.println("Excellent!");
                break;
            case 3: System.out.println("Great job!");
                break;
        }
    }


    private void displayPerformanceMessage(int userInput){
        if (userInput == sum) {
            setRemark();
        } else {
            System.out.println("No please try again");
        }
    }
    private void reDisplayQuestion(){
        System.out.println("How much is " + randomValue1 + "*" + randomValue2 + " ?");
    }
}
