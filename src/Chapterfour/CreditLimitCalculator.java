package Chapterfour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int accountNum;
        int getBalance = 0;
        int itemTotal;
        double creditApplied = 0;
        double creditLimit;
        double newBalance;


        System.out.println("Welcome to the Credit Calculator");

        System.out.println("Please Enter customer Account Number (or -1 to quit): ");
        accountNum = input.nextInt();

        if (accountNum != -1) {
            System.out.println("Please Enter Customer Beginning Balance: ");
            getBalance = input.nextInt();

            if (getBalance > creditApplied) {
                System.out.println("Please enter a Positive Amount: ");
                getBalance = input.nextInt();
            }
        }
        while (accountNum != -1){
            System.out.println("Please Enter The Total of Items Purchased this Month: ");
            itemTotal = input.nextInt();
            if(itemTotal < creditApplied){
                System.out.println("Please enter a Positive amount: ");
                itemTotal = input.nextInt();
            }
            System.out.println("Please Enter Credit Applied To Customer Account: ");
            creditApplied = input.nextInt();

            System.out.println("Please Enter Customer Credit: ");
            creditLimit = input.nextInt();


            newBalance = getBalance * itemTotal / creditApplied;
            creditApplied = creditLimit * getBalance *itemTotal;

            if ( newBalance > creditLimit ) {
                System.out.printf( "Account:\t%d\n", accountNum );
                System.out.printf( "Credit Limit:\t%.2f\n", creditLimit );
                System.out.printf( "Balance:\t%.2f\n", newBalance );
                System.out.print( "Credit limit exceeded.\n" );
                break;
            }

        }
        System.out.println("Thank You for using Credit Calculator");
        System.out.println("Goodbye");
    }
}
