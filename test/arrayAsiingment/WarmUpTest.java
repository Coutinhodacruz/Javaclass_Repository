package arrayAsiingment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WarmUpTest {


    WarmUp warmUp;
    @BeforeEach
    void startAllTestWith(){
        warmUp = new WarmUp();
        assertNotNull(warmUp);
    }

    @Test
    void checkIsAddition(){
        int [] numbers = {2,4,3,1,8};
        int [] count = {4,8,6,2,16};
        assertArrayEquals(count, WarmUp.addition(numbers));

    }
}
