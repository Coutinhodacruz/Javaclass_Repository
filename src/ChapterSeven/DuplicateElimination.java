package ChapterSeven;

import java.util.Scanner;

public class DuplicateElimination {

    private static final int[] arrValues = new int[10];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        while (count != 10) {
            System.out.printf("Enter value %d between 10 and 100: ", count+ 1);
            int num = input.nextInt();

            // ensure input is within range
            if (num < 10 || num > 100)
                continue;

            // print unique values
            if (isUnique(num))
                System.out.printf("Unique value: %d\n", num);

            try {
                // add to array and increase counter
                arrValues[count++] = num;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

            // display complete set of unique values
            printUnique();
        }
    }

    // ensure value is unique
    // Arrays.binarySearch() for some reason does not work so needed this
    public static boolean isUnique(int num) {
        for (int arrValue : arrValues) {
            if (arrValue == num)
                return false;
        }
        return true;
    }
    // display complete set of unique values
    public static void printUnique() {
        System.out.println("\nUnique values:\n");

        // base case is always first element
        System.out.print(arrValues[0] + " ");

        // unique value storage
        int unique = 0;

        // loop through remainder
        for (int i = 1; i < arrValues.length; i++) {
            // only check if value > 0
            // avoids redundant checking before array is filled
            if (arrValues[i] > 0) {
                // loop backwards checking for duplicates
                for (int j = i - 1; j >= 0; j--) {
                    if (arrValues[i] == arrValues[j]) {
                        unique = 0;
                        break;
                    } else {
                        unique = arrValues[i];
                    }
                }
                if (unique > 0)
                    System.out.print(unique + " ");
            }
        }
    }
}

















//    static Scanner input = new Scanner(System.in);
//
//    static int[] array1 = new int[10];
//
//    public static void main(String[] args) {
//        // loop insert 10 integer separated by space into the array.
//        for (int counter = 0; counter < array1.length; counter++) {
//            // convert string input of digit into int values
//            int userInput = Integer.parseInt(input.next()); // collect user input
//
//            // assign element userInput into an index of array1
//            array1[counter] = userInput;
//        }
//        // printing unique values
//        for (int i = 0; i < array1.length; i++) {
//            int ifNumberExist = 0; // hold the current number a value appears
//            // print the first index since it need not to be compared with any other index
//            if(i == 0)
//                System.out.print(array1[i] + " ");
//            else
//                // j < i means every element from array1[j] will be compare to array1[1 - i]
//                for (int j = 0; j < i; j++) {
//                    if(array1[j] == array1[i])  // check if the array element are equal
//                        ++ifNumberExist;  // increment if a match is found
//                }
//            // print current array1 element if no match was found
//            if(ifNumberExist < 1 && i > 0)
//                System.out.print(array1[i] + " ");
//        }
//    }