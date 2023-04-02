package arrayAsiingment;

import java.util.Arrays;

public class WarmUp {

    public static void main(String[] args) {
        int[] array = {2,4,3,1,8};

        System.out.println(Arrays.toString(addition(array)));

    }


    public static int[] addition(int[] numbers) {


        for (int i = 0; i < numbers.length; i++) {
            int count = numbers[i] *2;
            numbers[i] = count;
        }

        return numbers;
    }


}
