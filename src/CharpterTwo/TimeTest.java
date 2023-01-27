package CharpterTwo;

import java.time.LocalDate;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(23,59,0);
        time.display();


        Date date = new Date();
//        LocalDate now = LocalDate.now();
//        System.out.println(now.getMonth());
        System.out.println(date);

     }
}
