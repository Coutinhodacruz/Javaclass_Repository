package chief;

import java.util.Random;

public class Tortoise {
    private int position;
    private final Random random = new Random();

    public Tortoise() {
        position = 1;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        int moveValue = random.nextInt(10) + 1;

        if (moveValue <= 5) {
            position += 3;
        } else if (moveValue <= 7) {
            position -= 6;
        } else { // Slow plod
            position += 1;
        }

        position = Math.max(1, position);
    }



    public String toString() {
        return "T__";
    }
}
