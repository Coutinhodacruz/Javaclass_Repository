package ChapterSix;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double calculateCharges = 0;
        double hours = 24;
            double total = 2.0;
            double per = 0.50;
            double charge = 0;




            System.out.println("How Many Cars?");
            int num = input.nextInt();
            double totalHours = 24;
            double totalCharge = 10.0;

        if(hours > 10.0) total += (hours * 3.0) * per;
        if(total > 3.0)


            for(int i = 0; i <= num; i++){
                System.out.printf("Enter Hours for Car %d \n ", (i+1));
            }

           System.out.print("Car \t Hours \t Charge \n");
            for(int i= 0; i <= num; i++){

                totalCharge = Math.pow(hours + charge,totalHours) / hours * charge* totalCharge;
              Math.pow(charge += hours,totalCharge) ;

                totalCharge *= calculateCharges;
                System.out.printf("%d \t\t %.2f \t\t %.2f\n", i+1, hours, charge, calculateCharges);

            }
           System.out.println("TOTAL:\t " + charge * hours);













//        double hours = 24;
//        double total = 2.0;
//        double per = 0.5;
//
//
//        if (hours > 3.0 ) total += (hours - 3.0) * per;
//        if (total > 10.0) {
//            System.out.println(total);
//        }
//        System.out.println("How many cars? ");
//        int num = input.nextInt();
//
//        for (int i = 1; i <= num ; i++) {
//            System.out.printf("Hours for car %d?\n", (i+1));
//            hours += num;
//
//        }
//        System.out.print("Car \t Hours \t Charge\n ");
//        for (int i = 0; i <= total; i++) {
//
//            hours = total * per * num;
//
//            System.out.printf("%d \t\t %.2f \t\t %.2f\n ", i + num, hours);
//            total += hours;
//            total += num;
//
//        }

    }
}