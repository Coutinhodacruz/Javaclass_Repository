package ChapterSeven;

import java.util.Random;

public class RandomGenerator {

    private final Random secureRandom;

    public RandomGenerator() {
        secureRandom = new Random();
    }

    public int generateRandomNumber(int min, int max) {
        return secureRandom.nextInt(max - min + 1) + min;
    }

}
