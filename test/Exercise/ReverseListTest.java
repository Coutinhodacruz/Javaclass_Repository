package Exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ReverseListTest {

    ReverseList reverseList;


    @BeforeEach
    void startAllTestWith(){
        reverseList = new ReverseList();
        assertNotNull(reverseList);
    }

    @Test
    public void testYourNumberCanReverse(){
        int[] array = {2,3,4,5};
        int[] count = {5,4,3,2};
        assertArrayEquals(count, reverseList.reversedArray(array));
    }
}