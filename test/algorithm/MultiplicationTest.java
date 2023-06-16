package algorithm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    public void testMultiply() {
        int result = Multiplication.multiply(-2, -3);
        assertEquals(0, result);
    }
}
