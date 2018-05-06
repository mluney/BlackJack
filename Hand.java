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
                System.out.println(cards.get(i).getName());
                if(cards.get(i).getName().equals("Ace") && cards.get(i).getValue() == 11){
                    cards.get(i).setValue(1);
                    handValue -= 10;
                    break;
                }
            }
        }
    }

    public int getValue() {
        return handValue;
    }
}
