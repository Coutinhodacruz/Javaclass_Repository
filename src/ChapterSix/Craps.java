package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {

    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum  Status {CONTINUE, WON, LOST}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
   private static int bankBalance = 1000;
    String statement ;


        int myPoint = 0;

        int wager;

   public void gameStatus() {



    Scanner input = new Scanner(System.in);

        System.out.printf("Bank Balance: %d\n", bankBalance);
        System.out.print("Please enter a wager (or 0 to end): \n");
        wager = input.nextInt();

        if (bankBalance < wager) {
            System.out.println("Wager can not exceed Bank Balance");
        } else if (wager == 0) {
            System.out.println("Oh, you're broke huh?");
        } else {

            if (wager == bankBalance){
                System.out.println("Aw common, take a chance!");
            } else if (bankBalance  < 0) {
                System.out.println("You're up big. Now's the " +
                        "time to cash in your chips!");

            }else{
                System.out.println("You're way too lucky! I think you're a cheat!!!");

            }


            Status gameStatus;

            int sumOfDice = rollDice();

            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Point is %d%n", myPoint);
                    break;

            }
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();

                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else {
                    if (sumOfDice == SEVEN) {
                        gameStatus = Status.LOST;
                    }
                }
                if (gameStatus == Status.CONTINUE)
                    System.out.println("($ " + bankBalance + ") Roll again.");
            }
            if (gameStatus == Status.WON) {
                bankBalance += wager;
                System.out.println("($ " + bankBalance + ") Player wins." + "Roll Dice to play again");
            } else {
                bankBalance -= wager;
                checkBalance();
                System.out.println("$ " + bankBalance + ") Player loses." + " Roll Dice to play again");
            }


         }

   }


    private static void checkBalance() {
        if ( bankBalance <= 0 ) {
            System.out.println("Sorry. You busted!");
        }
    }



    private static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;


        System.out.printf("Player rolled %d + %d = %d%n", die1,die2, sum);

        return sum;
    }
    public String chatter()
    {
//        String statement = String.valueOf(randomNumbers);
//
//        switch ( ( int ) ( Math.random() * 5) ) {


        int number = 1+ randomNumbers.nextInt(6);
        switch (number){
            case 0:
                statement = "Oh, you're going for broke huh?";
                break;

            case 1:
                statement = "Aw common, take a chance!";
                break;

            case 2:
                statement = "You're up big. Now's the " +
                        "time to cash in your chips!";
                break;

            case 3:
                statement = "You're way too lucky! I think you're a cheat!!!";
                break;

            case 4:
                statement = "I'm betting all my money on you.";
                break;
        }

        return statement;
    }


}
