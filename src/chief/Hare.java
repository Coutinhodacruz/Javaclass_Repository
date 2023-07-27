package chief;

import java.util.Random;

public class Hare {
    private int position;
    private final Random random = new Random();


    public int getPosition() {
        return position;
    }

    public void move() {
        int moveValue = random.nextInt(10) + 1;

        if (moveValue <= 2) {
            position += 1;
        } else if (moveValue <= 4) {
            position += 9;
        } else if (moveValue == 5) { // Big slip
            position -= 12;
        } else if (moveValue <= 8) {
            position += 1;
        } else {
            position -= 2;
        }

        position = Math.max(1, position);
    }

    public String toString() {
        return "H__";
    }
}
