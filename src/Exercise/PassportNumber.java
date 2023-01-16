package Exercise;

import java.time.LocalDate;
import java.util.Date;

public class PassportNumber {
    public static void main(String[] args) {
       // String passportNumber = "123456";

        Passport ukPassPort = new Passport(123456, "\nCanada: ", LocalDate.of (2025,  2,  12));
        Passport usPassPort = new Passport(7891011,"\nSpain: ", LocalDate.of (2028, 6, 3));

        Date now = new Date();
        System.out.println(now);

    }
    static class Passport{
        int number;
        String country;
        LocalDate expiryDate;

        Passport(int number,String country,LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;

            System.out.println("passport: " + country + number + expiryDate);

        }
    }
}
