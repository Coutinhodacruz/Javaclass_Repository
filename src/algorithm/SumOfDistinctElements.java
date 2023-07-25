package algorithm;

import java.util.HashSet;

public class SumOfDistinctElements {
    public static int sumOfDistinctElements(int[] set1, int[] set2) {
        HashSet<Integer> distinctElements = new HashSet<>();

        for (int element : set1) {
            distinctElements.add(element);
        }

        for (int element : set2) {
            distinctElements.add(element);
        }

        int sum = 0;
        for (int element : distinctElements) {
            sum += element;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] set1 = {3, 1, 7, 9};
        int[] set2 = {2, 4, 1, 9, 3};

        int result = sumOfDistinctElements(set1, set2);
        System.out.println(result); // Output: 13
    }
}
//
//public class ClassWithMrChidi {
//    public static void main(String[] args) {
//        int[] setOne = {3, 1, 7, 9};
//        int[] setTwo = {2, 4, 1, 9, 3};
//
//        System.out.println(sumOfDistinctElements(setOne, setTwo));
//    }
//
//    public static int sumOfDistinctElements(int[] set1, int[] set2) {
//        int sum = 0;
//
//        for (int i = 0; i < set1.length; i++) {
//            boolean isDistinct = true;
//            for (int j = 0; j < set2.length; j++) {
//                if (set1[i] == set2[j]) {
//                    isDistinct = false;
//                    break;
//                }
//            }
//            if (isDistinct) {
//                sum += set1[i];
//            }
//        }
//
//        for (int i = 0; i < set2.length; i++) {
//            boolean isDistinct = true;
//            for (int j = 0; j < set1.length; j++) {
//                if (set2[i] == set1[j]) {
//                    isDistinct = false;
//                    break;
//                }
//            }
//            if (isDistinct) {
//                sum += set2[i];
//            }
//        }
//
//        return sum;
//    }
//}


