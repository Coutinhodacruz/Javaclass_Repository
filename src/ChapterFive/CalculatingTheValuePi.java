package ChapterFive;

public class CalculatingTheValuePi {
    public static void main(String[] args) {

        valueOfPi();


    }

    public static void valueOfPi(){
        double divisor = 1;

        double newAnswer = 0.0;

        for (int i = 1; i <= 200000; i++) {
            if (i % 2 == 0) {
                newAnswer -= 4 / divisor;
                divisor += 2;
            } else {
                newAnswer += 4 / divisor;
                divisor += 2;
            }
            System.out.println(i+ "   " + newAnswer);

        }
    }
}
