package ChapterSeven;

import java.util.Random;

public class TortoiseAndHareRace {
    private static final int NUM_SQUARES = 70;
    private static final int TORTOISE_FAST_PLOD = 3;
    private static final int TORTOISE_SLOW_PLOD = 1;
    private static final int TORTOISE_SLIP = -6;
    private static final int HARE_BIG_HOP = 9;
    private static final int HARE_SMALL_HOP = 1;
    private static final int HARE_BIG_SLIP = -12;
    private static final int HARE_SMALL_SLIP = -2;

    private static final char TORTOISE_SYMBOL = 'T';
    private static final char HARE_SYMBOL = 'H';
    private static final char OUCH_SYMBOL = 'O';

    private static final Random rand = new Random();

    private int tortoisePosition;
    private int harePosition;

    public TortoiseAndHareRace() {
        this.tortoisePosition = 1;
        this.harePosition = 1;
    }

    public void run() {
        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        while (true) {
            moveTortoise();
            moveHare();
            printRace();

            if (tortoisePosition >= NUM_SQUARES) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
                break;
            } else if (harePosition >= NUM_SQUARES) {
                System.out.println("Hare wins. Yuch.");
                break;
            } else if (tortoisePosition == harePosition) {
                System.out.println("OUCH!!!");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void moveTortoise() {
        int randNum = rand.nextInt(10) + 1;

        if (randNum <= 5) {
            tortoisePosition += TORTOISE_FAST_PLOD;
        } else if (randNum <= 7) {
            tortoisePosition += TORTOISE_SLIP;
        } else {
            tortoisePosition += TORTOISE_SLOW_PLOD;
        }

        if (tortoisePosition < 1) {
            tortoisePosition = 1;
        } else if (tortoisePosition > NUM_SQUARES) {
            tortoisePosition = NUM_SQUARES;
        }
    }

    private void moveHare() {
        int randNum = rand.nextInt(10) + 1;

        if (randNum <= 2) {
            harePosition += HARE_BIG_SLIP;
        } else if (randNum <= 4) {
            harePosition += HARE_SMALL_SLIP;
        } else if (randNum <= 5) {
            harePosition += HARE_BIG_HOP;
        } else if (randNum <= 8) {
            harePosition += HARE_SMALL_HOP;
        }

        if (harePosition < 1) {
            harePosition = 1;
        } else if (harePosition > NUM_SQUARES) {
            harePosition = NUM_SQUARES;
        }
    }

    private void printRace() {
        for (int i = 1; i <= NUM_SQUARES; i++) {
            if (i == tortoisePosition && i == harePosition) {
                System.out.print(OUCH_SYMBOL);
            } else if (i == tortoisePosition) {
                System.out.print(TORTOISE_SYMBOL);
            }
        }
    }
}
