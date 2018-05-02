package blackjack;

import java.util.LinkedList;
import java.util.Random;

public class Deck {

    private LinkedList<Card> cards = new LinkedList<>();
    private LinkedList<Card> shuffledDeck = new LinkedList<>();
    public static final Random random = new Random();

    public Deck() {
        String[] suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
        String[] name = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < name.length; j++) {
                cards.add(new Card(name[j], values[j], suits[i]));
            }
        }
    }
    
    public Card getNextCard() {
        return shuffledDeck.pop();
        /* Test stuff
        LinkedList<String> cardInfo = new LinkedList<>();
        cardInfo.add(card.getName());
        cardInfo.add(card.getSuit());
        System.out.printf("%S of %S\n", cardInfo.get(0), cardInfo.get(1));*/
    }

    public void shuffle() {
        for (int i = 0; i < cards.size(); i++) {
            int randomInt = random.nextInt((51));
            Card randomCard = cards.get(randomInt);
            if (!shuffledDeck.contains(randomCard)) {
                shuffledDeck.add(randomCard);
            } //else {
            //    i -= 1;
            //}
        }
    }
}
