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


        System.out.println("press 1 to Start ");
        int userChoice = input.nextInt();
        if (userChoice == 1) {

            System.out.println("How Many Cars?");
        }  int num = input.nextInt();
            double totalHours = 24;
            double totalCharge = 10.0;

            if (hours > 10.0) total += (hours * 3.0) * per;
            if (total > 3.0)


            for(int i = 0; i <= num; i++){
                System.out.println("Enter how many per car");
                input.nextLine();
                System.out.printf("Enter Hours for Car %d \n ", (i+1));
            }

           System.out.print("Car \t Hours \t Charge \n");
            for(int i = 0; i <= num; i++){

                totalCharge = Math.pow(hours + charge,totalHours) / hours * charge* totalCharge;
              Math.pow(charge += hours,totalCharge) ;

                totalCharge *= calculateCharges;
                System.out.printf("%d \t\t %.2f \t\t %.2f\n", i+1, hours, charge, calculateCharges);

            }
           System.out.println("TOTAL:\t " + charge * hours);













//       =

    }
}