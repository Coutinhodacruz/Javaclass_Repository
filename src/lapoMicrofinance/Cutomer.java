package lapoMicrofinance;

import java.math.BigDecimal;
import java.util.List;

public class Cutomer {
    
    private String name;

    private BigDecimal balance;
    
    private List<Transaction> transactionHistory;

    public Cutomer(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }
    
    public String withdraw(double amount) throws TrenchesException{
        if (balance.compareTo(BigDecimal.valueOf(amount)) < 1)
            throw new TrenchesException("sapa bi e merci !!");
        balance = balance.subtract(BigDecimal.valueOf(amount));
        return "WITHDRAWAL SUCCESSFUL";
    }

    @Override
    public String toString() {
        return "Customer[\nname: " + name +"\n" + "balance: " + balance +"\n]";
    }

}

