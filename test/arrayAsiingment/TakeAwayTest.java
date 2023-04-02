package arrayAsiingment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeAwayTest {

    TakeAway takeAway;
    @BeforeEach
    void startAllTestWith() {
        takeAway = new TakeAway();
        assertNotNull(takeAway);
    }

    @Test
    public void checkForTheHighestNumber(){
        int[] array = {2,4,3,1,5};
        int[] number = {14, 10};
        assertArrayEquals(number, TakeAway.addedNumber(array));
    }
}