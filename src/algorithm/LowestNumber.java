package algorithm;

import java.util.Arrays;

public class LowestNumber {


        public static void main(String[] args) {
            LowestNumber lowestNumber = new LowestNumber();
            System.out.println(Arrays.toString(lowestNumber.primeFactors(30)));

        }


        public int[] primeFactors(int number) {
            int[] factors = new int[counter(number)];
            int index = 0;
            for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors[index] = i;
                number /= i;
                index++;
                }
            }
            return factors;
        }

        private int counter(int number){
            int counter = 0;
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    counter++;
                    number /= i;
                }
            }
            return counter;
        }
}



