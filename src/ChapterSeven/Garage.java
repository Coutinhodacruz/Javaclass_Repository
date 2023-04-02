package ChapterSeven;

import java.util.ArrayList;

public class Garage {
//    private static final double MINIMUM_FEE = 2.0;
//    private static final int MINIMUM_HOURS = 3;
//    private static final double MAXIMUM_FEE = 10.0;
//    private static final double HOURLY_RATE = 0.5;
//
//
//
//
//    private ArrayList<Parker> parkers = new ArrayList<Parker>();
//
//
//    private String garageName = "";
//
//    public Garage(String garageName) {
//        this.garageName = garageName;
//
//    }
//
//    public void setGarageName(String garageName) {
//        this.garageName = garageName;
//    }
//
//    public String getGarageName() {
//        return garageName;
//    }
//
//    public void setParkers(ArrayList<Parker> parkers) {
//        this.parkers = parkers;
//    }
//
//    private ArrayList<Parker> getParkers() {
//        return parkers;
//    }
//
//
//    public void addParker(int hours) {
//        if (hours < 0) {
//            hours = 0;
//        } else if (hours > 24) {
//            hours = 24;
//        }
//        this.parkers.add(new Parker(hours));
//    }
//
//    public static double calculateCharges(Parker parker) {
//        return parker.calculateCharges();
//    }
//
//    public void printOut() {
//        System.out.println("**********\n Garage Printout for" + garageName);
//        double totalCharges = 0.0;
//
//        for (Parker parker : parkers) {
//            System.out.printf("Hours: %s \t Charge: $%.2f \n", parker.getHours(), parker.calCulateCharges());
//            totalCharges += parker.calculateCharges();
//        }
//        System.out.printf("Total Charges for day $%.2f \n", totalCharges);
//    }
//
//    public static class Parker {
//        private int hours;
//
//        public Parker() {
//            super();
//        }
//
//        public Parker(int hours) {
//            super();
//            this.hours = hours;
//        }
//
//        public int getHours() {
//
//            return hours;
//        }
//
//        public void setHours(int hours) {
//            this.hours = hours;
//        }
//    }
//
//    public double calculateCharges(int hours){
//        double retCalc = 0.0;
//
//        if (hours < MINIMUM_HOURS){
//            retCalc = MINIMUM_FEE;
//
//        }else {
//            retCalc = MINIMUM_FEE + (hours - MINIMUM_HOURS) * HOURLY_RATE;
//        }
//        if (retCalc > MAXIMUM_FEE){
//            retCalc += MAXIMUM_FEE;
//        }
//        return retCalc;
//
//    }
}
