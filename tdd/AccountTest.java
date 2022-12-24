package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositMoneyTest(){
        //given that coutinho has an account
        Account coutinhoAccount = new Account();
        //when coutinho deposit 500
        coutinhoAccount.deposit(500);
        //check that the balance is 500
        int balance = coutinhoAccount.getBalance();
        assertEquals(500, balance);
        System.out.println("test passed");
    }
    @Test
    public void depositTwiceTest(){
        //given coutinho has an account;
        Account coutinhoAccount = new Account();
        //given there is 300 in the account;
        coutinhoAccount.deposit(300);
        int balance = coutinhoAccount.getBalance();
        assertEquals(300, balance);
        //when i try to deposit 200;
        coutinhoAccount.deposit(200);
        //check that balance is 500;
        balance = coutinhoAccount.getBalance();
        assertEquals(500, balance);
    }
    @Test
    public void depositNegativeAmountTest(){
        //given i have an account with zero;
        Account coutinhoAccount = new Account();
        //when i try to deposit negative amount (-2300);
        coutinhoAccount.deposit(-2300);
        //check that the balance is zero;
        int balance = coutinhoAccount.getBalance();
        assertEquals(0,balance);
    }

    @Test
    public void withdrawal(){
        //given i have an account with zero amount
        Account continhoAccount =new Account();
        // i deposit some cash in my account
        continhoAccount.deposit(4000);
        //i make a withdrawal of (2000);
        continhoAccount.withdrawal(2000);
        //check that the balance is (2000);
        int balance = continhoAccount.getBalance();
        assertEquals(2000, balance);

    }

}
