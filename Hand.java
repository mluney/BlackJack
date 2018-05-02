package blackjack;

import java.util.LinkedList;

public class Hand {

    
    private int handValue;
    private LinkedList<Card> cards;

    /**
     * 
     */
    public Hand(){
        cards = new LinkedList<Card>();
        handValue = 0;
        /*this.cards = cards;
        for(int i = 0; i < cards.size(); i++){
            this.handValue += cards.get(i).getValue();
        }*/
    }
    
    public LinkedList getCardsInHand(){
        return cards;
    }
    /**
     * 
     * @param card 
     */
    public void addCard(Card card) {
        cards.add(card);
        handValue+= card.getValue();
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
        /*if(card.getName().equals("Ace") && handValue > 10){
            card.setValue(1);
            handValue += 1;
        } else {
            handValue += card.getValue();
        }*/
    }

    public int getValue() {
        return handValue;
    }
    
    public void bust(){
        System.out.printf("Current hand value = %d. Bust!", handValue);
    }
}
