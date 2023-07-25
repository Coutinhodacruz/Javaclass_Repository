package algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayTest {

    SortedArray sortedArray;

    @BeforeEach
    void startAllTestWith(){
        sortedArray = new SortedArray();
        assertNotNull(sortedArray);
    }

    @Test
    void checkAscending(){
        int[] numbers = {10, 9, 8, 2, 1, 7};
        int[] ascending = {1, 2, 7, 8, 9, 10};
        assertArrayEquals(ascending, SortedArray.sorted(numbers));
        assertSame(numbers,ascending);
    }

}