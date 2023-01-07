package ChapterFive;


public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {

        double amount;
        double principal = 1000;
        double rate = 0.90;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10 ; year++) {
            int divide = year % 3;
            if (divide == 0){
             year += rate;
            }
            amount = principal * Math.pow(1.0 + rate,year);
            System.out.printf("%4d%,20.2f%n",year,amount);
            
        }

    }
}
