package ChapterSeven;

public class LengthArgumentList {

    public static int product(int ... numbers){

        int product = 1;
        for(int number : numbers){
            product *= number;
            product++;
        }
        return product;
    }

    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 4;
        int num3 = 6;
        int num4 = 8;
        int num5 = 10;

        System.out.printf("The product of num1 and num2 is: %d%n", product(num1, num2));
        System.out.printf("The product of num1, num2 and num3 is: %d%n", product(num1, num2, num3));
        System.out.printf("The product of num1, num2, num3 and num4 is: %d%n", product(num1, num2, num3, num4));
        System.out.printf("The product of num1, num2, num3, num4 and num5 is: %d%n", product(num1, num2, num3, num4, num5));

    }
}
