package algorithm;

import java.util.Arrays;

public class SortedArray {

    public static int[] sorted(int[] numbers){
        int count;
        for (int index = 0; index < numbers.length; index++) {
            for (int secondIndex = index + 1; secondIndex < numbers.length ; secondIndex++) {
                if (numbers[index] > numbers[secondIndex]){
                    count = numbers[index];
                    numbers[index] = numbers[secondIndex];
                    numbers[secondIndex] = count;
                }
            }

        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] ascending = {10, 9, 8, 2, 1, 7};

        System.out.println(Arrays.stream(ascending).min());
        System.out.println(Arrays.stream(ascending).max());
        System.out.println(Arrays.stream(ascending).sum());

        System.out.println(Arrays.toString(sorted(ascending)));

    }
}
