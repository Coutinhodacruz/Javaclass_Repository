package ChapterSix;

import java.util.Scanner;

public class GuessTheNumberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessTheNumber guessTheNumber = new GuessTheNumber();


        System.out.println("Enter a number");
        int num = scanner.nextInt();

        while (num== 1){
            guessTheNumber.theNumber();

            System.out.println("Enter a number");
              num = scanner.nextInt();
        }
    }
}
