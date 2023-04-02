package arrayAsiingment;

import java.util.Arrays;

public class TakeAway {

    public static void main(String[] args) {
        int[] array = {2,4,3,1,5};
        System.out.println(Arrays.toString(addedNumber(array)));

    }

    public static int[] addedNumber(int[] number){
        int[] count = new int[2];

       int[] addingNumber = new int[number.length];
        int total = 0;

        for (int k : number) {
            total += k;
        }
        for (int j = 0; j < number.length ; j++) {
            addingNumber[j] = total-number[j];
        }
        count[0] = addingNumber[number.length-2];
        count[1] = addingNumber[number.length-1];
        return count;
    }


}
