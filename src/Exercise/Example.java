package Exercise;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String[] cars = {"Volvo","BMW","Benze","Toyota"};
        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        int[] array = {86,23,67,54,34,66,12,20,19,90,};
        int total = 0;

        for (int number : array){
            total += number;
        }
        System.out.printf("Total of array elements: %d%n",total);
        for (int[] myNumber : myNumbers) {
            for (int i : myNumber) {
                System.out.println(i);

            }

        }
        System.out.print(Arrays.toString(cars));
        System.out.println();
        System.out.println();

        System.out.print("[");
        for (String car : cars)
            System.out.print(car + ",");
        System.out.print("]");

        for (int row = 1; row <= 7 ; row++) {
            for (int column = 1; column < row; column++) {
                System.out.print("*");

            }
            System.out.println();
        }

        int biggi = 6;

        for (int star = 1; star <= 7; star++) {
            for (int moon = 1; moon < biggi; moon++) {
                System.out.print(" ");

            }
            for (int sun = 1; sun < star; sun++) {
                System.out.print("*");
                --biggi;
            }
            System.out.println();

        }

    }
}
