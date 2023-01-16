package ChapterSix;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("do you want to enter another number (yes/no)? ");
            String a = input.next();

            boolean result = isMultiple(num1, num2);
            if (result) {
                System.out.println(num1 + " is a multiple of " + num2);
            }else{
                System.out.println(num1 + " is not a multiple of " + num2);
            }
            if (YesOrNo(a)){
                break;
            }
        }
    }

    private static boolean isMultiple(int x, int y) {
        return x % y == 0 || y % x == 0;
    }

    private static boolean YesOrNo(String a) {
        if (a.equals("yes"))
            return false;
        else if (a.equals("no")) {
            return true;
        }else
            return true;
    }
}
