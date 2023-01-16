package CharpterTwo;


import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name(empty - Exit):");
            String name = scanner.nextLine();
            if(name.length()==0){
                break;
            }
            System.out.println("Hours");
            int hours = Integer.parseInt(scanner.nextLine());
            System.out.println("Rate:");
            double rate = Double.parseDouble(scanner.nextLine());
            System.out.println(name + " Gross: " + (hours <= 40 ? rate * hours : (rate * 40) + (rate * (hours - 40) * 1.5)));

        }

    }

}































