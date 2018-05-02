package blackjack;

public class Main {

    public static void main(String[] args) {
        /* Testing Deck
        Deck testDeck = new Deck();
        System.out.println(testDeck.getC());
        testDeck.shuffle();
        testDeck.getNextCard();*/
        
        Dealer dealer = new Dealer();
        dealer.startGame();
        //System.out.println(dealer.getHandValue());
        dealer.playerHitOrStand();
    }
}
