package algorithm;

public class Multiplication {

    public static int multiply(int firstNumber, int secondNumber){
        int sum = 0;
        for (int i = 0; i < secondNumber; i++) {
            sum+=firstNumber;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(multiply(2, 3));
    }

}


