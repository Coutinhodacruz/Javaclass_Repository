package ChapterSeven;
import java.util.Random;

public class GameOfCrap {
    private static final Random randomNumbers = new Random();

        private enum Status { CONTINUE, WON, LOST }

        public static void main(String[] args) {
            int[] wins = new int[21];
            int[] losses = new int[21];
            int totalRolls = 0;

            for (int i = 0; i < 1_000_000; i++) {
                int sumOfDice = rollDice();
                int rollCount = 1;

                Status gameStatus;

                switch (sumOfDice) {
                    case 7:
                    case 11:
                        gameStatus = Status.WON;
                        break;
                    case 2:
                    case 3:
                    case 12:
                        gameStatus = Status.LOST;
                        break;
                    default:
                        gameStatus = Status.CONTINUE;
                        int point = sumOfDice;
                        do {
                            sumOfDice = rollDice();
                            rollCount++;
                            if (sumOfDice == point) {
                                gameStatus = Status.WON;
                            } else if (sumOfDice == 7) {
                                gameStatus = Status.LOST;
                            }
                        } while (gameStatus == Status.CONTINUE);
                        break;
                }

                if (rollCount <= 20) {
                    if (gameStatus == Status.WON) {
                        wins[rollCount - 1]++;
                    } else {
                        losses[rollCount - 1]++;
                    }
                } else {
                    if (gameStatus == Status.WON) {
                        wins[20]++;
                    } else {
                        losses[20]++;
                    }
                }

                totalRolls += rollCount;
            }

            for (int i = 0; i < 20; i++) {
                System.out.printf("Won on roll %d: %d%n", i + 1, wins[i]);
            }
            System.out.printf("Won after the twentieth roll: %d%n", wins[20]);

            for (int i = 0; i < 20; i++) {
                System.out.printf("Lost on roll %d: %d%n", i + 1, losses[i]);
            }
            System.out.printf("Lost after the twentieth roll: %d%n", losses[20]);

            double winProbability = (double) (wins[0] + wins[1] + wins[2]) / 1_000_000;
            System.out.printf("Chances of winning at craps: %.2f%%%n", winProbability * 100);

            double averageRolls = (double) totalRolls / 1_000_000;
            System.out.printf("Average length of a game of craps: %.2f rolls%n", averageRolls);
        }

        private static int rollDice() {
            int die1 = 1 + randomNumbers.nextInt(6);
            int die2 = 1 + randomNumbers.nextInt(6);
            return die1 + die2;
        }


}
