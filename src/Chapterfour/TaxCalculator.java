package Chapterfour;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the name of Citizen " + i + ":");
            String name = scanner.nextLine();

            System.out.println("Enter the earnings of Citizen " + i + " in USD:");
            double earnings = scanner.nextDouble();

            double tax = calculateTax(earnings);
            System.out.println(name + "'s total tax is: $" + tax);


            scanner.nextLine();
        }

        scanner.close();
    }

    public static double calculateTax(double earnings) {
        double taxRate = 0.15;
        double ceiling = 30000;

        if (earnings > ceiling) {
            taxRate = 0.20;
        }

        return earnings * taxRate;
    }
}

