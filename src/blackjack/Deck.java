package blackjack;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;
    private ArrayList<Card> shuffledDeck;

    
    public Deck(){
        String[] suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
        String[] name = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        
        for(int i = 0; i < suits.length; i++){
            for(int j = 0; j < name.length; j++){
                cards.add(new Card(name[j], values[j], suits[i]));
            }
        }
        
        
    }
    
    public Card getNextCard() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void shuffle() {
    }
}
