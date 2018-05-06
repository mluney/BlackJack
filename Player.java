package blackjack;

public class Player implements User {

    private Hand hand;

    public Player(){
        hand = new Hand();
    }
    
    /*public void displayHand(){
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
    }*/
    
    public Hand getHand(){
        return hand;
    }
    
    @Override
    public void addCard(Card card) {
        hand.addCard(card);
    }

    @Override
    public int getHandValue() {
        return hand.getValue();
    }
}
