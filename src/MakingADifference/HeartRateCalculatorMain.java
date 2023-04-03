package MakingADifference;

import java.time.LocalDate;

public class HeartRateCalculatorMain {


    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        heartRateCalculator heartRateCalculator = new heartRateCalculator("John","Legend", date);
        System.out.println(heartRateCalculator.calculateAge());
        System.out.println(heartRateCalculator.tarHeartRate1());
        System.out.println(heartRateCalculator.tarHeartRate2());

    }
}
