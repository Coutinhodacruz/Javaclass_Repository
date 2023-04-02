package arrayAsiingment;

public class SleepWarmUp {
    public static void main(String[] args) {
        int[] array = {8,4,3,5,2,1};
        System.out.println(lowestNumber(array));


    }



    public static int lowestNumber(int[] numbers){
        int lowNumber = numbers[0];

        for (int number : numbers) {
            if (number < lowNumber) {
                lowNumber = number;
            }
        }


        return lowNumber;
    }

}
