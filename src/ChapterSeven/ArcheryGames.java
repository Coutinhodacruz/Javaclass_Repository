package ChapterSeven;

public class ArcheryGames {

    private final int[][] scores;

    public ArcheryGames(int players, int chances) {
        scores = new int[players][chances];
    }

    public void simulateGame(RandomGenerator randomNumberGenerator) {
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = randomNumberGenerator.generateRandomNumber(0, 10);
            }
        }
    }

    public void printScores() {
        System.out.println("Player\t1st Chance\t2nd Chance\t3rd Chance\tTotal Score");
        for (int i = 0; i < scores.length; i++) {
            int totalScore = 0;
            System.out.print(i + 1);
            for (int j = 0; j < scores[i].length; j++) {
                totalScore += scores[i][j];
                System.out.print("\t\t" + scores[i][j]);
            }
            System.out.println("\t\t" + totalScore);
        }
    }

    public int getWinner() {
        int maxScore = -1;
        int winner = -1;
        for (int i = 0; i < scores.length; i++) {
            int totalScore = 0;
            for (int j = 0; j < scores[i].length; j++) {
                totalScore += scores[i][j];
            }
            if (totalScore > maxScore) {
                maxScore = totalScore;
                winner = i + 1;
            }
        }
        return winner;
    }
}
