package ChapterFive;

public class TrianglePrintingProgram {
    public static void main(String[] args) {

        for (int row = 1; row <= 7; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        int total = 6;
        for (int row = 1; row <= 7; row++) {
            for (int num = 1; num <= total; num++) {
                System.out.print(" ");
            }
            for (int column = 1; column <=row ; column++) {
                System.out.print("*");
            }
            System.out.println();
            --total;
        }
        System.out.println();

        int space = 6;
        for (int i = 0; i <= 7 ; i++) {
            for (int j = 0; j <= space; j++) {
                System.out.print("*");
            }
            for (int boy = 0; boy <= i; boy++) {
                System.out.print("  ");
            }
            System.out.println();
            space--;

        }
//        System.out.println();

        int blanks=1;   int shapes = 7;
        for (int row = 0; row <= 8; row++) {
            for (int star = 0; star <= 8; star++){
                System.out.print("");
//                star*=8;
            }
            System.out.println();
            for (int p = 1; p <= blanks; p++) {
                System.out.print(" ");
            }
            for (int shape = 1; shape <= shapes; shape++) {
                System.out.print("*");
            }
            System.out.print("");
            blanks++;
            shapes--;

        }

    }

}
