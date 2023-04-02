package Exercise;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {

    public static void main(String[] args) {

        int[] num = {12,3,6,20};

        List<Integer> total = new ArrayList<>();

        for (int i = num.length-1; i >= 0; i--) {
            total.add(num[i]);

        }
        System.out.println(total);

    }
}





