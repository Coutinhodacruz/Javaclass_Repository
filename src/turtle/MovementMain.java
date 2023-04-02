package turtle;

import java.util.Arrays;

public class MovementMain {
    public static void main(String[] args) {

        char[][] numbers = new char[3][3];


        numbers[0][0] = '0';
        numbers[0][1] = 'X';
        numbers[0][2] = 'O';
        numbers[1][0] = 'X';
        numbers[1][1] = 'O';
        numbers[1][2] = 'O';
        numbers[2][0] = 'X';
        numbers[2][1] = '0';
        numbers[2][2] = 'X';
        for (char[] number : numbers){
            System.out.println(Arrays.toString(number));

        }


    }
}
