package arrayAsiingment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SleepWarmTest {

    SleepWarmUp sleepWarmUp;
    @BeforeEach
    void startAllTestWith(){
        sleepWarmUp = new SleepWarmUp();
        assertNotNull(sleepWarmUp);
    }
    @Test
    public void checkLowersTNumber(){
        int[] num = {8,4,3,5,2,1};
        int[] counter = {1};
        assertArrayEquals(counter, new int[]{SleepWarmUp.lowestNumber(num)});

    }
}
