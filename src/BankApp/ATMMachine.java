package BankApp;

import javax.swing.*;

public class ATMMachine {
    private static Bank FCMB = new Bank("First city monument Bank");
    public static void main(String[] args) {
        displayMainMenu();
    }
    private static void displayMainMenu(){
        String mainMenu = """
                Welcome to First City Monument Bank
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                """;
        System.out.println(mainMenu);
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createAccount();
            case '2' -> deposit();
            //case '3' -> withdraw();
            //case '4' -> transfer();
            case '5' -> checkBalance();

            default -> {//"don't be silly".
                //show menu again
            }
        }
    }

    private static void checkBalance() {
        int accountNumber = Integer.parseInt(input("What is your account number?"));
        String pin = input("Enter pin");
        int balance = FCMB.checkBalanceFor(accountNumber,pin);
        display("Your balance is " + balance);
        displayMainMenu();
    }


    private static void createAccount(){
        String accountName = input("What is the account name?"); //1. collect account name
        String accountPin = input("What is the account pin?"); //2. collect account pin

        //create account from bank

        FCMB.createAccountFor("Coutinho","1234");
        display("Account created successfully");


        //3. collect account from bank
        displayMainMenu(); //4. return to main menu
    }

    private static void deposit(){
        int accountNumber = Integer.parseInt(input(("What is your account number?")));
        int amount  = Integer.parseInt(input("How much do you want to deposit?"));

        FCMB.deposit(amount,accountNumber);
        display("Deposited successfully");
        displayMainMenu();
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(prompt);
//        return scanner.nextLine();
    }
    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
        //System.out.println(message);
    }

    private static void print(String message) {
        System.out.println(message);
    }
}