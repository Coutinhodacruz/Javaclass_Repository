package tdd;

public class Account {
    private int balance;
    private int cash;

    public void deposit(int amount) {
        if (amount >= 0)balance = amount + balance;
    }

    public int getBalance() {

        return balance;
    }

    public void withdrawal(int cash) {
        if (cash > 0 && cash <= balance) balance = balance - cash;
    }
}

