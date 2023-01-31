package ChapterSeven;

public class InitArray {
    public static void main(String[] args) {
        int[][] coutinho = {{3, 6, 9}, {4, 8, 12}};
        int[][] dacruz = {{10, 20, 30}, {40, 50, 60}};

        System.out.println("Values in array1 by row are");
        outputArray(coutinho);

        System.out.printf("%nValues in array2 by row are%n");
        outputArray(dacruz);

    }

    private static void outputArray(int[][] array) {
        for (int[] ints : array) {
            for (int column = 0; column < array.length; column++) {
                System.out.printf("%d   ", ints[column]);

            }
            System.out.println();
        }
    }
}