package blackjack;

public class Player {

    private Hand hand; //This is a test YO

    public Player(Hand hand){
        this.hand = hand;
    }
    
    public void addCard(Card card) {
        hand.addCard(card);
    }

    public int getHandValue() {
        return hand.getValue();
    }
}
