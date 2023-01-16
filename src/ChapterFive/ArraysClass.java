package ChapterFive;

import java.text.NumberFormat;
import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);
        int[][] numbers = { {1,2,3},{4,5,6} };
//        int[] numbers = {2,3,4,5,6};
//        Arrays.sort(numbers);
//        System.out.println(numbers.length);
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;
        System.out.println(Arrays.deepToString(numbers));
    }
}
