package CharpterTwo;

public class Loops {
    public static void main(String[] args) {
       int counter = 0;
        while (counter <= 5){
            System.out.println(counter);
            counter++;
        }
        for (int count = 0; count <= 5;count++){
            System.out.println(count);
        }
        int countNo = 0;
        do {
            System.out.println(countNo);
            countNo++;
        }while (countNo <= 5);

        for (int i = 1; i <= 8; i++) {
            for (int column = 1; column <= i; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

int space = 6;
        for (int row = 1; row <= 7; row++) {
            for (int dominoes = 1; dominoes <= space; dominoes++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print(" *");
            }
            System.out.println();
            space--;
        }
    }
}
