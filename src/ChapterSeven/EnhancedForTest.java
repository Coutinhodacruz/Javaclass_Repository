package ChapterSeven;

public class EnhancedForTest {
    public static void main(String[] args) {
        int[] array = {74,22,45,69,90,12,32,44,33,87,56,100,99};
        int total = 0;

        for (int number : array){
            total += number;
            System.out.printf("Total of array element %d%n",total);
        }
    }
}
