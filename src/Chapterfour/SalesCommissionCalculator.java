package Chapterfour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double commission = 0;
        double earning;
        double gross_sales_in_the_week;
        double sold_1_items;
        double sold_2_items;
        double sold_3_items;
        double sold_4_items;
        double weekly_salary;

        System.out.print("Enter the value of sold 1 item ");
        sold_1_items = input.nextDouble();
        input.nextLine();
        System.out.print("Enter the value of sold 2 item ");
        sold_2_items = input.nextDouble();
        input.nextLine();
        System.out.print("Enter the value of sold 3 item ");
        sold_3_items = input.nextDouble();
        input.nextLine();
        System.out.print("Enter the value of sold 4 item ");
        sold_4_items = input.nextDouble();
        input.nextLine();
        weekly_salary = 200;
        gross_sales_in_the_week = sold_1_items + sold_2_items + sold_3_items + sold_4_items;
        commission = gross_sales_in_the_week * 0.09;
        earning = weekly_salary + commission;

        System.out.println("Value of commission: " + commission);
        System.out.println("Value of earning: " + earning);
        System.out.println("Value of gross sales in the week: " + gross_sales_in_the_week);
        System.out.println("Value of weekly salary: " + weekly_salary);



    }
}
