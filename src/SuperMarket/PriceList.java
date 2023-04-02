package SuperMarket;

import java.util.Scanner;

public class PriceList {

    public int totalBookPrice;

    public int totalBagPrice;

    public int totalShoePrice;



    int totalPriceOfAllProducts;
    int bookQuantity;

    int bagQuantity;

    int shoeQuantity;

    Scanner scanner = new Scanner(System.in);
    public String displayMenu() {
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

    public int getUserInput() {
        int userInput;
        userInput = scanner.nextInt();

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
            System.out.println("Go and come back later");
        }return 0;
    }
    public  void loopUserInput(){
        String usersChoice;
        do {
            System.out.println("Do you want to continue? yes or no");
            usersChoice = scanner.next();

            if (usersChoice.equals("yes")){
                System.out.println(displayMenu());
                getUserInput();
            } else if (usersChoice.equals("no")) {
                 totalPriceOfAllProducts = totalBagPrice + totalShoePrice + totalBookPrice;
                System.out.println();
                System.out.println("The total price of your purchase is " + totalPriceOfAllProducts);
                System.out.println("Thanks for your patronage");
            }else{
                System.out.println("invalid selection");
            }
        }while (usersChoice.equals("yes"));

    }
}
