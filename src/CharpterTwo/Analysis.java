package CharpterTwo;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failure = 0;
        int studentCounter = 0;

        while (studentCounter < 10) {
            System.out.println("Enter result (1 = paas, 2 = fail):");
            int result = input.nextInt();

            if (result == 1) {
                ++passes;


            } else if (result == 2){
                failure++;

            }
            studentCounter += 1;
        }
        System.out.printf("passed: %d%n Failed: %d%n",passes,failure );
        if (passes <= 8){
            System.out.println("Bonus to instructor");
        }
    }
}
