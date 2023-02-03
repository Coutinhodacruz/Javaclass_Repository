package arrayAssignment;

public class Array {


    int count =0;
    public int[] multiply(int[] numbers) {
        int [] multiply = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            int count = numbers[i] * numbers[i];
            multiply[i] = count;
        }
        return multiply;
    }

    public int[] ascending(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]){
                    count = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = count;
                }

            }

        }
        return numbers;
    }

    public int[] descending(int[] numbers) {
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]){
                    count = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = count;
                }

            }

        }
        return numbers;
    }
}
