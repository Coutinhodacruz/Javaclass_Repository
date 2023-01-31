package ChapterSeven;

import java.security.SecureRandom;

public class DeckOfCard {

    public static class Card{

        private final String face;
        private final String suit;


        public Card(String face, String suit) {
            this.face = face;
            this.suit = suit;
        }

        @Override
        public String toString() {
            return face + "of" + suit;
        }
    }

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARD = 52;

    private final Card [] deck = new Card[NUMBER_OF_CARD];
    private int currentCard =0;

    public DeckOfCard(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits =  {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }
    public void shuffle(){
        currentCard = 0;

        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARD);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard(){
        if (currentCard < deck.length){
            return deck[currentCard++];
        }
        else {
            return null;
        }
    }
}
