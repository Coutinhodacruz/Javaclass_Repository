import org.junit.jupiter.api.Test;
import Exercise.PriceList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperMarketTest {

    @Test
    void SuperMarket(){
        //given a price list in a superMarket
        PriceList priceList = new PriceList();
        //display menu - shoe, bag, book
        String menu = priceList.displaymenu();
        //check
        assertEquals(menu, priceList.displaymenu());
    }

    @Test
    void setBookPrice(){
        PriceList priceList = new PriceList();
        int totalPriceOfBooks = priceList.setBookPrice(3);
        assertEquals(600, totalPriceOfBooks);

    }

    @Test
    void setBagPrice(){
        PriceList priceList = new PriceList();
        int totalPriceOfBags = priceList.setBagPrice(3);
        assertEquals(1200, totalPriceOfBags);

    }

    @Test
    void setShoePrice(){
        PriceList priceList = new PriceList();
        int totalPriceOfShoes = priceList.setShoes(3);
        assertEquals(2100, totalPriceOfShoes);

    }

    @Test
    void UserInput(){
        PriceList priceList = new PriceList();
        int userInput = priceList.getUserInput();
        assertEquals(0, userInput);
    }
}
