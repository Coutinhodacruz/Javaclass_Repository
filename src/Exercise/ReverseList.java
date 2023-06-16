package Exercise;

import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        int[] okay = {9,8,7,6,5,4,3,2,1,0};
        int [] numbers = {2,3,4,5};
        System.out.println(Arrays.toString(reverseList.reversedArray(numbers)));
        System.out.println(Arrays.toString(reverseList.sampleNumber(okay)));
    }


    public  int[] reversedArray(int[] array){
        int number = 0;
        int newNumber = array.length - 1;
        while (number < newNumber){
            int count = array[number];
            array[number] = array[newNumber];
            array[newNumber] = count;
            number++;
            newNumber--;
        }
        return array;
    }

    public int[] sampleNumber(int[] justin){
        int blur = 0;
        int cut = justin.length - 1;
        while (blur < cut){
            int book = justin[blur];
            justin[blur] = justin[cut];
            justin[cut] = book;
            blur++;
            cut--;
        }
        return justin;
    }
}

