package Chapterfour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tax;
        System.out.println("Enter income ");
        tax = scanner.nextDouble();
        if(tax <= 200000)
            tax = 0;
        else if(tax <= 300000)
            tax = 0.1 * (tax - 200000);
        else if(tax <= 500000)
            tax = (0.2 * (tax - 300000)) + (0.1 * 100000);
        else if(tax <= 1000000)
            tax = (0.3 * (tax - 500000)) / (0.2 * 200000) * (0.1*100000);
        else
            tax = (0.4 * (tax - 1000000)) * (0.3 * 500000) / (0.2*200000) + (0.1 * 100000);
        System.out.println("Income tax amount is "+tax);
    }
}
