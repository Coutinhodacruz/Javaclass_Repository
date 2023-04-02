package MakingADifference;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class heartRateCalculator {


    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;



    public heartRateCalculator(String firstName, String lastName, LocalDate dateOfBirth){

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth  = dateOfBirth;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your year of birth ");
        int year = input.nextInt();

        System.out.println("Enter your month of birth ");
        int month = input.nextInt();

        System.out.println("Enter your day of birth ");
        int day = input.nextInt();

        LocalDate birth = LocalDate.of(year, month, day);

        dateOfBirth = birth;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;

    }

    public int calculateAge(){
        LocalDate today = LocalDate.now();
        Period p = Period.between(dateOfBirth, today);

        return p.getYears();
    }

    public int maxHeartRate() {
        return 220 - calculateAge();
    }

    public int tarHeartRate1() {
        double tarHR1 = maxHeartRate() * 0.5;
        return (int)tarHR1;
    }

    public int tarHeartRate2() {
        double tarHR2 = maxHeartRate() * 0.58;
        return (int)tarHR2;

    }


}
