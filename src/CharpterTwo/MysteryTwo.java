package CharpterTwo;

public class MysteryTwo {
    public static void main(String[] args) {
        int row = 5;

        while (row >= 1){
            int column = 5;

            while (column >= 1){
                ++column;
            }
            --row;
            System.out.printf(row % 2 == 0 ? "X" : "O");
        }
    }
}
