package arrayAsiingment;

import arrayAssignment.Array;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArrayTest {

    Array array;
    @BeforeEach
    void startAllTestWith(){
        array = new Array();
        assertNotNull(array);
    }

    @Test
    void checkIsMultiply(){
        int [] numbers = {2,4,6,3,5,1};
        int [] count = {4,16,36,9,25,1};
        assertArrayEquals(count,array.multiply(numbers));

    }

    @Test
    void checkAscending(){
       int[] numbers = {2,4,6,3,5,1};
       int[] ascending = {1,2,3,4,5,6};
       assertArrayEquals(ascending,array.ascending(numbers));
    }

    @Test
    void checkDescending(){
        int[] numbers = {2,4,6,3,5,1};
        int[] descending = {6,5,4,3,2,1};
        assertArrayEquals(descending,array.descending(numbers));
    }


}
