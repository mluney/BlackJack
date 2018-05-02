package blackjack;

import java.util.ArrayList;

public class Hand {

    
    private int handValue = 0;
    private ArrayList<Card> cards;

    public Hand(ArrayList<Card> cards){
        this.cards = cards;
        for(int i = 0; i < cards.size(); i++){
            this.handValue += cards.get(i).getValue();
        }
    }
    
    public void addCard(Card card) {
        cards.add(card);
        if(handValue > 21){
            for(int i = 0; i < cards.size(); i++){
                if(cards.get(i).equals("Ace") && cards.get(i).getValue() == 11){
                    cards.get(i).setValue(1);
                    handValue -= 10;
                    break;
                }
            }
            if(handValue > 21){
                bust();
            }
        }
        if(card.getName().equals("Ace") && handValue > 10){
            card.setValue(1);
            handValue += 1;
        } else {
            handValue += card.getValue();
        }
    }

    public int getValue() {
        return handValue;
    }
    
    public void bust(){
        System.out.printf("Current hand value = %d. Bust!", handValue);
        
    }
}
