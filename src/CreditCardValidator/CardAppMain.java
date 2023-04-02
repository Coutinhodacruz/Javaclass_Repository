package CreditCardValidator;

import java.util.Scanner;

public class CardAppMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hello, Kindly Enter Card number to verify: ");
        String cardNumber = scan.nextLine();


        CardValidator cardValidator = new CardValidator(cardNumber);
        System.out.println(cardValidator.validateCard());
    }
}
