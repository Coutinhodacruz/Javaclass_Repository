package CharpterTwo;

import tdd.PriceList;

import java.util.Scanner;

public class SuperMarketMain {
    public static void main(String[] args) {
        PriceList priceList = new PriceList();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome \n" + priceList.displaymenu());
        int userInput = input.nextInt();
        priceList.getUserInput(userInput);
    }
}


