package ChapterFive;

public class TheSumOfSeries {
    public static void main(String[] args) {

        System.out.println("n\tSum");

        for (int number = 1; number <= 100; number++) {
            int sum = (number * (number + 1)) / 2;
            System.out.println(number + "\t" + sum);
        }
    }
}
