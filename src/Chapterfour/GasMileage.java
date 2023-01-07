package Chapterfour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles;
        int gallon = 0;
        double mpg;
        int total_miles = 0;
        int total_gallon = 0;
        double total_mpg = 0.00;
        int trips = 0;

        System.out.print("Enter trip 1 mileage or -1 to quit: ");
        miles = input.nextInt();
        if (miles >= -1){
            System.out.println("Enter trip 1 gallon: ");
            gallon = input.nextInt();
            trips++;
        }
        while (miles > -1){
            total_miles += miles;
            total_gallon += gallon;
            total_mpg = (double) total_miles / total_gallon;

            mpg = (double) miles / gallon;
              System.out.printf("Trip %d's mpg (miles per gallon) is %.1f\n", trips,mpg );

            if (trips > 1){
                System.out.printf("\n Total miles of your %d trips is %d\n",trips,total_miles );
                System.out.printf(" Total gallon of %d trips is %d\n", trips,total_gallon );
                System.out.printf(" Total mpg of %d trips is %.1f\n", trips,total_mpg);
            }
            trips++;
            System.out.printf("\n Enter trip %d mpg or -1 to quit: ", trips);
            miles = input.nextInt();
            if (miles > -1){
                System.out.printf("Enter trip %d gallon: ", trips);
                gallon = input.nextInt();
            }
        }
        if (total_miles != 0){
            System.out.printf("\n Final total miles driven is: %d\n",total_miles);
            System.out.printf("Final total gallon used is: %d\n",total_gallon);
            System.out.printf("Final combined mpg is: %.1f\n",total_mpg);
        }
        else
            System.out.println("No trip information was entered.\n\n ");
    }
}
