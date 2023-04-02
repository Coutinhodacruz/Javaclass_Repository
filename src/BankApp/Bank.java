package BankApp;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int lastAccountNumberGenerated;
    private List<Account> accounts;
    private String bankName;

    public  Bank (String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    public void createAccountFor(String accountName, String pin) {
        int accountNumber = generateAccountNumber();
        Account newAccount = new Account(accountNumber, accountName, pin);
        accounts.add(newAccount);
    }

    private int generateAccountNumber() {
        return ++lastAccountNumberGenerated;
    }

    public int countNumberOfAccount() {
        return accounts.size();
    }
    public int checkBalanceFor(int accountNumber, String pin) {
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        return foundAccount.checkBalance(pin);
    }

    public void deposit(int amount, int accountNumber) {
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        foundAccount.deposit(amount);
    }

    private Account findAccountByAccountNumber(int accountNumber) {
        for(Account account: accounts){
            boolean accountNumberMatches = account.getAccountNumber() == accountNumber;
            if(accountNumberMatches) return account;
        }
        return null;
    }

    public void transfer(int amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
        Account senderAccount = findAccountByAccountNumber(senderAccountNumber);
        Account receiverAccount = findAccountByAccountNumber(receiverAccountNumber);
        senderAccount.withdraw(amount, senderPin);
        receiverAccount.deposit(amount);

    }

    public void withdrawMoney(int amount, int accountNumber, String pin) {
        Account customerAccountNumber = findAccountByAccountNumber(accountNumber);
        customerAccountNumber.withdraw(amount,pin);
    }

    public int withdrawNegativeAmount(int withdrawAmount, int accountNumber, String pin) {
        Account customerAccountNumber = findAccountByAccountNumber(accountNumber);
        customerAccountNumber.withdraw(withdrawAmount,pin);
        if(withdrawAmount < 0 ) {
            return customerAccountNumber.getAccountNumber();
        }
        return 0;
    }
}


































//import java.util.ArrayList;
//import java.util.List;
//
//public class Bank {
//
//    private int lastAccountNumberGenerated;
//    private List<Account> accounts;
//    private String bankName;
//
//
//    public Bank(String bankName){
//        this.bankName = bankName;
//        accounts = new ArrayList<>();
//
//    }
//
//
//    public void creatAccount(String accountName, String accountPin) {
//        int accountNumber = generateAccount();
//        Account newAccount = new Account(accountNumber,accountName,accountPin);
//        accounts.add(newAccount);
//    }
//
//    private int generateAccount() {
//        return ++lastAccountNumberGenerated;
//    }
//
//    public int countNumberOfAccount() {
//        return accounts.size();
//    }
//    public int checkBalance(int accountNumber, String pin){
//        Account foundAccount = findAccountByAccountNumber(accountNumber);
//        return foundAccount.checkBalance(pin);
//
//    }
//    public void deposit(int amount, int accountNumber){
//        Account foundAccount = findAccountByAccountNumber(accountNumber);
//        foundAccount.deposit(amount);
//
//
//    }
//
//    private Account findAccountByAccountNumber(int accountNumber) {
//        for (Account account : accounts){
//            boolean accountNumberMatches = account.getAccountNumber()== accountNumber;
//            if (accountNumberMatches) return account;
//        }
//        return null;
//    }
//
//    public void transfer(int amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
//        Account sendersAccount = findAccountByAccountNumber(senderAccountNumber);
//        Account receiverAccount = findAccountByAccountNumber(receiverAccountNumber);
//        sendersAccount.withdraw(amount, senderPin);
//        receiverAccount.deposit(amount);
//
//    }
//
//
//    public void createAccountFor(String coutinho, String s) {
//    }
//
//    public int checkBalanceFor(int accountNumber, String pin) {
//        return accountNumber;
//    }
//}
