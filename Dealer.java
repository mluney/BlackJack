package blackjack;

public class Dealer implements User {
    Card card;
    private Hand hand;

    public Card getCard() {
        return this.card;
    }

    public void dealCard() {
    }
    
    @Override
    public Card addCard(Card card) {
        return card;                // This is a place holder for now
    }
    
    public Boolean hitOrStand() {
        return true;
    }

    @Override
    public int getHandValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
