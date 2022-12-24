package tdd;

import java.util.Scanner;

public class PriceList {

    public int totalBookPrice;

    public int totalBagPrice;

    public int totalShoePrice;




    int bookQuantity;

    int bagQuantity;

    int shoeQuantity;

    Scanner scanner = new Scanner(System.in);
    public String displaymenu() {
        return ("""
                press 1 for book
                press 2 for shoe
                press 3 for bag""");
    }

    public int setBookPrice(int bookQuantity) {
        this.bookQuantity = bookQuantity;
         totalBookPrice = 200 * bookQuantity;
        return totalBookPrice;
    }


    public int setBagPrice(int bagQuantity) {
        this.bagQuantity = bagQuantity;
        totalBagPrice = 400 * bagQuantity;
        return totalBagPrice;
    }

    public int setShoes(int shoeQuantity) {
        this.shoeQuantity = shoeQuantity;
        totalShoePrice = 700 * shoeQuantity;
        return totalShoePrice;
    }

    public int getUserInput(int userInput) {
        if (userInput == 1){

            System.out.println("The price of each book is 200.\n" +
                    "How many books do you want?");
            int bookQuantity = scanner.nextInt();
            totalBookPrice = 200 * bookQuantity;
            System.out.println(totalBookPrice);
            return totalBookPrice;
        } else if (userInput == 2) {
            System.out.println("The price of each shoe is 700.\n" +
                    "How many shoe do you want?");
            int shoeQuantity = scanner.nextInt();
            totalShoePrice = 700 * shoeQuantity;
            System.out.println(totalShoePrice);
            return totalShoePrice;
            
        } else if (userInput == 3) {
            System.out.println("The price of each bag is 400.\n" +
                    "How many bag do you want?");
            int bagQuantity = scanner.nextInt();
            totalBagPrice = 400 * bagQuantity;
            System.out.println(totalBagPrice);
            return totalBagPrice;
        }else{
            System.out.println("You no get watin u won buy");
        }
        return 0;
    }
}
