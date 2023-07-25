package ChapterSeven;

import java.security.SecureRandom;

public class ArcheryGame {
    public static final int NUM_PLAYERS = 4;
    public static final int NUM_CHANCES = 3;

    private int[][] scores;
    private int[] totalScores;


    private static final SecureRandom random = new SecureRandom();

    public ArcheryGame() {
        scores = new int[NUM_PLAYERS][NUM_CHANCES];
        totalScores = new int[NUM_PLAYERS];
    }

    public void play() {
        for (int i = 0; i < NUM_PLAYERS; i++) {
            for (int j = 0; j < NUM_CHANCES; j++) {
                scores[i][j] = random.nextInt(11);
                totalScores[i] += scores[i][j];
            }
        }
    }

    public void printScores() {
        System.out.println("Player\t1st Chance\t2nd Chance\t3rd Chance\tTotal Score");
        for (int i = 0; i < NUM_PLAYERS; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t\t%d\n", i+1, scores[i][0], scores[i][1], scores[i][2], totalScores[i]);
        }
        int winner = getWinner();
        System.out.printf("Player %d wins with a total score of %d\n", winner+1, totalScores[winner]);
    }

    int getWinner() {
        int maxScore = 0;
        int winner = 0;
        for (int i = 0; i < NUM_PLAYERS; i++) {
            if (totalScores[i] > maxScore) {
                maxScore = totalScores[i];
                winner = i;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        ArcheryGame game = new ArcheryGame();
        game.play();
        game.printScores();

    }

    public int[][] getScores() {
        System.out.println("Player\t1st Chance\t2nd Chance\t3rd Chance\tTotal Score");
        for (int i = 0; i < NUM_PLAYERS; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t\t%d\n", i+1, scores[i][0], scores[i][1], scores[i][2], totalScores[i]);
        }
        int winner = getWinner();
        System.out.printf("Player %d wins with a total score of %d\n", winner+1, totalScores[winner]);


        return new int[0][];
    }

    public int[] getTotalScores() {
        int maxScore = 0;
        int winner = 0;
        for (int i = 0; i < NUM_PLAYERS; i++) {
            if (totalScores[i] > maxScore) {
                maxScore = totalScores[i];
                winner = i;
            }
        }
        return new int[]{winner};
    }
}

