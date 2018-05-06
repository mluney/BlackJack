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
    
    //public LinkedList getCardsInHand(){
    //    return cards;
    //}
    
    public void displayHand() {
        LinkedList<Card> myHand = cards;
        LinkedList<String> handInfo = new LinkedList<>();
        for (int i = 0; i < myHand.size(); i++) {
            handInfo.add(myHand.get(i).getName());
            handInfo.add(myHand.get(i).getSuit());
        }

        System.out.print("hand consists of ");
        for (int i = 0; i < handInfo.size(); i++) {
            if(i == (handInfo.size() - 2)){
                System.out.printf("and %S of %S.\n", handInfo.get(i), handInfo.get(++i));
            } else {
                System.out.printf("%S of %S, ", handInfo.get(i), handInfo.get(++i));
            }
        }
    }
   
    public void displayDealerStartHand() {
        LinkedList<Card> myHand = cards;
        LinkedList<String> handInfo = new LinkedList<>();
        for (int i = 0; i < myHand.size(); i++) {
            handInfo.add(myHand.get(i).getName());
            handInfo.add(myHand.get(i).getSuit());
        }

        System.out.printf("Dealer starts with one facedown card and a %S of %S\n\n", handInfo.get(2), handInfo.get(3));
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
