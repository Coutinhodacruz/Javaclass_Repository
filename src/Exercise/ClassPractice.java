package Exercise;


import java.util.Arrays;
import java.util.List;

public class ClassPractice {

    public static void main(String[] args) {

        


        List<String> drinks = Arrays.asList("can", "cup");


        for (String drink : drinks) System.out.print(drink + ",");

        String[] os = new String[] { "Mac", "Linux", "Windows" };



        Arrays.sort(os);

        System.out.println(Arrays.binarySearch(os, "Mac"));

        int[] arrays = {2,8,8,1,5,2,1,3};

        for (int i = 1; i < arrays.length; i+=2) {

            System.out.println(arrays[i]);

        }
        int count = 0;
        for (int number : arrays){
            boolean countIsOdd = count % 2!= 0;
            if (countIsOdd) System.out.println(number);
            count++;
        }

        for (int i = 1; i < arrays.length; i++) {

          boolean indexIsEven = i % 2 == 0;
            System.out.println("index is "+i+ " ");
            if (indexIsEven)continue;
            System.out.println(arrays[i]);
        }

    }
}
