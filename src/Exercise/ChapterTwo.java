package Exercise;

import java.util.Arrays;

public class ChapterTwo {
    public static void main(String[] args) {
//        System.out.println("+ *");
//        System.out.println("***");
//        System.out.println("****+*");
//        System.out.println("****");
//        System.out.println("**");
//        System.out.print("*");
//        System.out.println("***");
//        System.out.println("*****");
//        System.out.print("****");
//        System.out.println("**");


        int[] array = {1,2,3,4,5,6,7,8,8};
        int[] arr = new int[9];

        for (int i = args.length; i > 0 ; i--) {
            Arrays.fill(arr, array[i]);
            System.out.println(Arrays.toString(arr));
        }

    }
}
