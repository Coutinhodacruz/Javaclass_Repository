package Exercise;

import algorithm.LowestNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LowestNumberTest {

    LowestNumber lowestNumber;

    @BeforeEach
    void startAllTestWith() {
        lowestNumber = new LowestNumber();
        assertNotNull(lowestNumber);
    }

    @Test
    public void CheckTheLowestNumberTest() {
        System.out.println(Arrays.toString(lowestNumber.primeFactors(8)));
        assertArrayEquals(new int[]{2, 2, 2}, lowestNumber.primeFactors(8));
    }
}
