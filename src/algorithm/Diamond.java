package algorithm;

public class Diamond {

    public static void printDiamond(int row){
        int space = row - 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            space--;
        }

        space = 0;

        for (int i = row; i > 0; i--) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            space++;
        }
    }

    public static void main(String[] args) {
        printDiamond(5);
    }
}

