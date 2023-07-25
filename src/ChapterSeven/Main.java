package ChapterSeven;

public class Main {
    public static void main(String[] args) {
        int players = 4;
        int chances = 3;

        RandomGenerator randomNumberGenerator = new RandomGenerator();
        ArcheryGames game = new ArcheryGames(players, chances);

        game.simulateGame(randomNumberGenerator);
        game.printScores();

        int winner = game.getWinner();
        System.out.println("Player " + winner + " wins!");
    }
}
