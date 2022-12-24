package tdd;
import java.util.Scanner;

class PetrolPurchaseTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PetrolPurchase Petrol = new PetrolPurchase();


        Petrol.setName("Total Filling Station");
        String result = Petrol.getName();
        System.out.printf("PetrolPurchase name is: %s%n", result);
        System.out.println();

        Petrol.setLocation("Charity oshodi road");
        result = Petrol.getLocation();
        System.out.printf("Location name is: %s%n", result);
        System.out.println();

        Petrol.setPetrolType("Fuel && Diesel");
        result = Petrol.getPetrolType();
        System.out.printf("Petrol type is: %s%n", result);
        System.out.println();

      //  Petrol.setQuantity(8000, 5000);
      //  Petrol.getQuantity();
      //  System.out.println("Quantity of Fuel && Diesel is: 8000, 5000");
      //  System.out.println();






    }

}