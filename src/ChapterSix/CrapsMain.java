package ChapterSix;


import java.util.Scanner;

public class CrapsMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Craps craps = new Craps();
        craps.gameStatus();


        System.out.println("press 1 to roll again (or 0 to end):  ");
        int userInput = scanner.nextInt();

        while (userInput == 1){
            craps.gameStatus();

            System.out.println("press 1 to roll again (or 0 to end):");
            userInput = scanner.nextInt();


        }


    }
}
