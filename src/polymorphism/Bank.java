package polymorphism;

public class Bank {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount("Teens");
        account.deposit(1200);
        System.out.println(account.getBalance());
    }
}
