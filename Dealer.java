package blackjack;

import java.util.Scanner;

public class Dealer implements User {
    private Player player;
    private Deck deck;
    private Hand hand;

    public Dealer(){
        hand = new Hand();
        deck = new Deck();
    }
    
    public Card getNextCard() {
        return deck.getNextCard();
    }

    public void startGame(){
        System.out.println("Test");
        player = new Player();
        System.out.println("Test");
        deck.shuffle();
        System.out.println("Test");
        player.addCard(getNextCard());
        player.addCard(getNextCard());
        addCard(getNextCard());
        addCard(getNextCard());
        System.out.println("Test");        
    }
    
    public void dealCard(){
        
    }
    
    @Override
    public void addCard(Card card) {
        hand.addCard(card);               // This is a place holder for now
    }
    
    public void playerHitOrStand() {
        Boolean flag = true;
        Scanner keyboard = new Scanner(System.in);
        
        while(flag == true){
            System.out.println("Would you like to hit? y/n: ");
            String answer = keyboard.next();
            if(answer.equals("y")){
                Card newCard = getNextCard();
                player.addCard(newCard);
                player.getHand();
            } else {
                flag = false;
            }
        }
    }

    @Override
    public int getHandValue() {
        return hand.getValue();
    }

}
