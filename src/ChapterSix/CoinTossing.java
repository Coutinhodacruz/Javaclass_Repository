package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {

    private enum Coin{HEADS, TAILS}

    SecureRandom random = new SecureRandom();

    Scanner scanner = new Scanner(System.in);


    int choice;
    Coin coinFlip;

    public void flip(){
        System.out.println("welcome to the coin toss game:\n");
        do {
            System.out.println("Enter 1 to toss game or 0 to quit: ");
            choice = scanner.nextInt();

            if (choice == 1){
                flip();
            } else if (choice > 1) {
                System.out.println("Invalid entry please enter 1 or 0");
                choice = scanner.nextInt();
            }
        }while (choice != 0);

        int result = random.nextInt(2);
        if (result == 0){
            coinFlip = Coin.HEADS;
            System.out.println("you flipped heads");
        }else{
            coinFlip = Coin.TAILS;
        }
            System.out.println("you flipped tails");

        if (Math.random() < .5){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }
    }

}
