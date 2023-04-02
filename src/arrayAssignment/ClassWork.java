package arrayAssignment;

import java.util.ArrayList;
import java.util.List;

public class ClassWork {
    public static void main(String[] args) {
        int[] arrays = {2, 4, 6, 8, 9, 12, 15};
        System.out.println(evenNumber(arrays));

    }


        public static List<Integer> evenNumber(int[] count){
            List<Integer> isEvenNumber = new ArrayList<>();
            for (int i = 0; i < count.length; i++) {
                if (i % 2 != 0){
                    isEvenNumber.add(count [i]);

            }
            }

            return isEvenNumber;
        }

}
