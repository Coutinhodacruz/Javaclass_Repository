package ChapterSeven;

public class PixelQuantization {
    public static void main(String[] args) {

        int[] array = {10,11,12,13,14,15,16,17,19,20};
        System.out.printf("%s%8s%n", "index" , "value");

        for (int counter = 0; counter < array.length; counter++) {

            array [counter] += 2 * counter;
            System.out.printf("%d%8d%n",counter,array[counter]);
        }
    }
}
