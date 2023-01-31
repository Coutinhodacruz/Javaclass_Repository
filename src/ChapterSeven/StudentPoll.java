package ChapterSeven;

public class StudentPoll {
    public static void main(String[] args) {

        int[] response= {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int [] frequency = new int[6];

        for (int amswer = 0; amswer < response.length; amswer++) {
            try {
                ++frequency[response[amswer]];
            }
            catch (ArrayIndexOutOfBoundsException dominic){
                System.out.println(dominic.getMessage());
                System.out.printf("  response[%d] = %d%n%n", amswer, response[amswer]);
            }
        }
        System.out.printf("%s%10s%n", "rating", "frequency");

        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequency[rating]);

        }
    }
}
