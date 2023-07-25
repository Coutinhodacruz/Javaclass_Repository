package lapoMicrofinance;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cutomer cutomer = new Cutomer("Favour", new BigDecimal(20));
        try {
            String message = cutomer.withdraw(80.90);
            System.out.println(message);
            System.out.println(cutomer);
        }catch (TrenchesException exception){
            System.out.println("ERROR " + exception.getMessage());
        }finally {
            System.out.println(cutomer);
            System.out.println("Thanks for Banking with us!! ");
        }

    }
}
