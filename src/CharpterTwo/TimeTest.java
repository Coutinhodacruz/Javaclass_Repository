package CharpterTwo;

import java.time.LocalDate;
import java.util.Date;


public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println("hours " +":"+ "minutes" +":"+ "seconds");
        time.display();

        Date date = new Date();
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
        System.out.println(date);

     }
}
