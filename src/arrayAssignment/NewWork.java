package arrayAssignment;

import java.util.ArrayList;
import java.util.List;

public class NewWork {
    public static void main(String[] args) {
        int[] array = {5, 8, 3, 3, 5, 2, 5, 1, 14};
        System.out.println(evenNumber(array));


    }
//    for (int i = 1; i < arrays.length; i++) {
//
//          boolean indexIsEven = i % 2 == 0;
//            System.out.println("index is "+i+ " ");
//            if (indexIsEven)continue;
//            System.out.println(arrays[i]);
//        }

    public static List<Integer> evenNumber(int[] count){
        List<Integer> isEvenNumbers = new ArrayList<>();
        for (int i = 1; i < count.length; i++) {
            if (i % 2 != 0) {
                isEvenNumbers.add(count [i] );
            }
        }
        return isEvenNumbers;
    }

}

