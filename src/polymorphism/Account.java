package polymorphism;

public class Account {


    private int balance;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    public void deposit(int amount) {
        balance += amount;
    }

}
