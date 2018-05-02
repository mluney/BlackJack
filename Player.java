package blackjack;

import java.util.LinkedList;

public class Player {

    private Hand hand;

    public Player(){
        hand = new Hand();
    }
    
    public void getHand(){
        LinkedList<Card> myHand = hand.getCardsInHand();
        LinkedList<String> handInfo = new LinkedList<>();
        for(int i = 0; i < myHand.size(); i++){
            handInfo.add(myHand.get(i).getName());
            handInfo.add(myHand.get(i).getSuit());
        }

        System.out.print("Hand consists of: ");
        for(int i = 0; i < handInfo.size(); i++){
            System.out.printf("%S of %S, ", handInfo.get(i), handInfo.get(++i));  
        }
        System.out.println();
    }
    
    public void addCard(Card card) {
        hand.addCard(card);
    }

    public int getHandValue() {
        return hand.getValue();
    }
}
