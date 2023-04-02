package Assignment;

import java.util.Arrays;

public class OccurElement {
    public static void main(String[] args) {


        int[] count = {1,2,3};
        int[] counter = {4,5,6};


        // No 3

        int[] array = {2,3,4,5,6,7,8};
        int num = 9;

        for (int element : array){
            if (num == element){

                System.out.println("True");
            }else
                System.out.println("False");
            break;

        }
        // No 4

        int check = Arrays.binarySearch(array,9);

        boolean verify = check >= 0;
        System.out.println(verify);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) System.out.println(array[i]);
        }

        // No 5
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) System.out.print(array[i] + " ");

        }
        // No 6

        int sum = 0;
        for (int arr : array){
            sum += arr;
        }
        System.out.println(sum);

        // No 7

        String name = "Gee";
        String reversed = "";
        for (int i = name.length() - 1; i >= 0 ; i--) {
            reversed += name.charAt(i);
            System.out.println(reversed);
        }

        // No 8

        if (name.equals(reversed)){
            System.out.println("Its a palindrome");
        }else
            System.out.println("Its not a palindrome");
        System.out.println();

        // No 9

        int aLen = count.length;
        int bLen = counter.length;
        int [] result = new int[aLen + bLen];

        System.arraycopy(count, 0, result, 0, aLen);
        System.arraycopy(counter, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
    }
}
