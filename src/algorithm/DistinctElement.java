package algorithm;

import java.util.ArrayList;

public class DistinctElement {
    public static void main(String[] args) {

        int[] set1 = {3,1,7,9};
        int[] set2 = {2,4,1,9,3};

        System.out.println(distinctElement(set1, set2));
    }

    public static int distinctElement(int[] setOne, int[] setTwo) {
        int sum = 0;

        ArrayList<Integer> distinct = new ArrayList<>();

        for (int index = 0; index < setOne.length; index++) {
           if (!distinct.contains(setOne[index])) {
               distinct.add(setOne[index]);
           }
        }

        for (int index = 0; index < setTwo.length; index++) {
            if (!distinct.contains(setTwo[index])){
                distinct.add(setTwo[index]);
            }
        }
        for (int i = 0; i < distinct.size(); i++) {
            sum += distinct.get(0);

        }
        return sum;
    }
}
