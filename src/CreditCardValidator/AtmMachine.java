package CreditCardValidator;

import javax.swing.*;
import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AccountBank[] accounts = new AccountBank[10];
        for (int i = 1; i < 11; i++) {
            accounts[i - 1] = new AccountBank();
        }

        System.out.print("Enter an id (1 - 10): ");
        int id = input.nextInt();

        if (id < 1 || id > 10) {
            id = incorrectId(id);
        }

        while (true) {
            display(input(""));
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();

            if (choice == 4) {
                System.out.printf("%nEnter an id (1 - 10): ");
                id = input.nextInt();

                if (id < 1 || id > 10) {
                    id = incorrectId(id);
                }
            }
            performChoice(id, choice, accounts);
        }
    }


    public static int incorrectId(int id) {
        Scanner in = new Scanner(System.in);
        while (id < 1 || id > 10) {
            System.out.print("Please enter a valid id: ");
            id = in.nextInt();
            System.out.println();
        }
        return id;
    }

    public static void performChoice(int id, int choice, AccountBank[] accounts) {
        Scanner in = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.printf("The balance is $%.1f%n",
                        accounts[id - 1].getBalance());
                break;

            case 2:
                System.out.print("Enter the amount to withdraw: ");
                accounts[id - 1].withdraw(in.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                accounts[id - 1].deposit(in.nextDouble());
                break;
            default:
                break;
        }
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);

    }

    private static String display(String message) {
        JOptionPane.showMessageDialog(null, message);
        return message;
    }


//    public static void menuDisplay() {
//        System.out.printf("%nMain menu%n");
//        System.out.println("1: check balance");
//        System.out.println("2: withdraw");
//        System.out.println("3: deposit");
//        System.out.println("4: exit");
//    }

}
