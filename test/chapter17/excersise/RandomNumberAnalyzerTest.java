package chapter17.excersise;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomNumberAnalyzerTest {

    @Test
    void testDisplayNumberStats() {
        int[] numbers = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        String expectedOutput = """
                Generated numbers:\s
                100
                200
                300
                400
                500
                600
                700
                800
                900
                1000
                Odd count: 0
                Even count: 10
                Overall average: 550.0
                Odd numbers average: 0.0
                Even numbers average: 550.0
                """;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOutputStream = System.out;
        System.setOut(new PrintStream(outputStream));

        RandomNumberAnalyzer.displayNumberStats(numbers);


        System.setOut(originalOutputStream);


        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }
}
