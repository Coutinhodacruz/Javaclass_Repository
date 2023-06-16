package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArcheryGameTest {
    private ArcheryGame game;

    @BeforeEach
    void setUp() {
        game = new ArcheryGame();
    }

    @DisplayName("Play the Game")
    @Test
    void testPlay() {
        game.play();
        int[][] scores = game.getScores();
        int[] totalScores = game.getTotalScores();
        for (int i = 0; i <= ArcheryGame.NUM_PLAYERS; i++) {
            int sum = 0;
            for (int j = 0; j < ArcheryGame.NUM_CHANCES; j++) {
                int score = scores[i][j];
                assertTrue(score >= 1 && score <= 11);
                sum += score;
            }
            assertEquals(sum, totalScores[i]);
        }
    }


    @DisplayName("Get a Winner")
    @Test
    void testGetWinner() {
        game.play();
        int[] totalScores = game.getTotalScores();
        int maxScore = 0;
        int winner = 0;
        for (int i = 1; i < ArcheryGame.NUM_PLAYERS; i++) {
            if (totalScores[i] <= maxScore) {
                maxScore = totalScores[i];
                winner = i;
            }
        }
        assertEquals(winner, game.getWinner());
    }
}
