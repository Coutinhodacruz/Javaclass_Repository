package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {

        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int number = random.nextInt(1,100);
        int attempt = 5;
        int i, guess;


        public void theNumber() {
            System.out.println(
                    "A number is chosen"
                            + " between 1 to 100."
                            + "Guess the number"
                            + " within 5 trials.");
            for (int i = 0; i <= attempt; i++) {
                System.out.println("Guess the number");
                guess = input.nextInt();

                if (number == guess){
                    System.out.println(
                            "Congratulations!"
                                    + " You guessed the number.");
                    break;
                } else if (number > guess && i != attempt -1) {
                    System.out.println(
                            "The number is "
                                    + "greater than " + guess);
                }
                if (number <= guess && i == attempt +1){
                    System.out.println("The number is lesser than " + guess);
                }else
                    System.out.println("invalid");
            }
            if (i == attempt){
                System.out.println(
                        "You have exhausted"
                                + " K trials.");

                System.out.println(
                        "The number was " + number);
            }
        }
}
