package Exercise;

import java.util.Scanner;

public class ParkingExample{
    Scanner scanner = new Scanner(System.in);


    int perCharge;
    double customerParking,garage;
    String name;
    int hours;
    double total;

    public String display(){
        return """
                we charged per hour you parked your car
                $1000 per hour
                $1500 for two hours
                $3000 for three hours""";

    }


    public  void ChargesParked(){
        System.out.println();
        System.out.println("Enter customer name");
        name = scanner.nextLine();

        System.out.println("Enter Hours " + name + " parked");
        int hoursParked = scanner.nextInt();

        customerParking = (int) this.garage;

        System.out.println(name + " owes $" + hoursParked);

        for (int i = 0; i < hoursParked; i++) {
            if (hours > 10.0) total += (hours * 3.0) * customerParking;

            if (hours <= 3)
                hours = 2 * 24;
            else if (hours <= 19)
                this.garage = (int) (((hours - 2) * 0.50) + 2.00);
            else {
                garage = 10 *24;
            }
            hours++;
           perCharge++;

        }






    }


}
