package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkippingNumber {

    public static void main(String[] args) {
        String[] resultArray = new String[]{"a", "b", "#", "#", "d", "#", "o"};

        System.out.println(Arrays.toString(tempArray(Arrays.toString(resultArray))));

    }
    public static int[] tempArray(String resultArray){
        ArrayList<String> tempArray = new ArrayList<>(List.of(resultArray));
        for (int i = 0; i < tempArray.size(); i++) {
            if (tempArray.get(i).equals("#")){
                tempArray.remove(tempArray.get(i));
                tempArray.remove(tempArray.get(i-1));
                i-=2;
            }
        }
        return new int[1];
    }
}

//    public static void main(String[] args) {
//        String[] resultArray = new String[]{"a", "b", "#", "#", "d", "#", "o"};
//        ArrayList<String> tempArray = new ArrayList<>(List.of(resultArray));
//        for (int i = 0; i < tempArray.size(); i++) {
//            if (tempArray.get(i).equals("#")){
//                tempArray.remove(tempArray.get(i));
//                tempArray.remove(tempArray.get(i-1));
//                i-=2;
//            }
//        }
//        System.out.println(tempArray);
//
//    }
//}