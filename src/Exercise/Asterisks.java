package Exercise;

public class Asterisks {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 || i == 9 || i == 5) && j <= 3) {
                    System.out.print(" *");
                } else if ((i > 1 && i < 5 && j == 3) || (i > 5 && i < 9 && j == 1)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
           System.out.println();
        }
    }

}
