package arrayAssignment;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        Array array = new Array();
        int [] numbers = {2,4,6,3,5,1};

        System.out.println(Arrays.toString(array.ascending(numbers)));
        System.out.println(Arrays.toString(array.descending(numbers)));
        System.out.println(Arrays.toString(array.multiply(numbers)));
    }
}
