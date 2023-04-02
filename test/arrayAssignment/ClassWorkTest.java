package arrayAssignment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassWorkTest {

    ClassWork classWork;


    @Test
    public void isEvenNumber(){
        int[] numbers = {2, 4, 6, 8, 9, 12, 15};
        int [] result = {4,8,12};
        assertEquals(Arrays.toString(result),String.valueOf(ClassWork.evenNumber(numbers)));


    }



}