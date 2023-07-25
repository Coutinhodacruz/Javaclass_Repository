package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lcm {
    public int[] getFactor(int number){
        List<Integer> result = new ArrayList<>();
        for (int counter = 2; counter < number; counter++) {
            while (number>0&&number%counter==0){
                result.add(counter);
                number=number/counter;
            }
        }
        int[] factors = buldArrayFromList(result);

        return factors;
    }

    private int[] buldArrayFromList(List<Integer> numbers) {
        int[] factors;
        factors =new int[numbers.size()];
        for (int counter = 0; counter < numbers.size(); counter++) {
            factors[counter] = numbers.get(counter);
        }
        return factors;
    }

    public static void main(String[] args) {
        Lcm lcm = new Lcm();
        System.out.println(Arrays.toString(lcm.getFactor(20)));

    }

}























//           int[] factors = primeFactors(10);
//            int[] lcmFactors = new int[factors.length];
//            int index = 0;
//            for (int i = 2; i <= 8; i++) {
//                int count = 0;
//                for (int j = 0; j < factors.length; j++) {
//                    if (factors[j] == i) {
//                        count++;
//                    }
//                }
//                if (count > lcmFactors[index]) {
//                    lcmFactors[index] = count;
//                }
//                if (count > 0 && index < lcmFactors.length - 1) {
//                    index++;
//                }
//            }
//            ArrayList<Integer> result = new ArrayList<>();
//            for (int i = 0; i < lcmFactors.length; i++) {
//                for (int j = 0; j < lcmFactors[i]; j++) {
//                    result.add(i + 2);
//                }
//            }
//            int[] arr = result.stream().mapToInt(i -> i).toArray();
//            System.out.println(Arrays.toString(arr));
//        }

















