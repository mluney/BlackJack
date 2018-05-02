package blackjack;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Deck {

    private ArrayList<Card> cards;
    private ArrayList<Card> shuffledDeck;
    Set<Integer> used = new HashSet<>(); 
    public static final Random gen = new Random(); 

    
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
        int newRandom;  
        do {  
            newRandom = gen.nextInt(52);  
        } 
        while (used.contains(newRandom));  
          
        used.add(newRandom);
        return cards.get(newRandom);
    }  
      

    

    public void shuffle() {
    
    }
}//Deck 