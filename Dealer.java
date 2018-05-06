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
        player = new Player();
        deck.shuffle();
        player.addCard(getNextCard());
        player.addCard(getNextCard());
        addCard(getNextCard());
        addCard(getNextCard()); 
        player.getHand();
        System.out.printf("Player's hand value = %d\n", player.getHandValue());
        playerHitOrStand();
    }
    
    public Card dealCard(){
        return getNextCard();
    }
    
    @Override
    public void addCard(Card card) {
        hand.addCard(card);               // This is a place holder for now
    }
    
    public void playerHitOrStand() {
        Boolean flag = true ;
        Scanner keyboard = new Scanner(System.in);
        
        while(flag == true){
            System.out.print("Would you like to hit? y/n: ");
            String answer = keyboard.next();
            if(answer.equals("y")){
                player.addCard(dealCard());
                player.getHand();
                System.out.printf("Player's hand value = %d\n", player.getHandValue());
                if(player.getHandValue() > 21){
                    System.out.print("Bust! Would you like to play again? y/n ");
                    answer = keyboard.next();
                    if(answer.equals("y")){
                        System.out.printf("\nStarting new game.\nShuffling Deck...\n\n");
                        startGame();
                    } else {
                        System.out.println("Thanks for losing Sucka!");
                        flag = false;
                    }
                }
            } else {
                flag = false;
                dealerPlays();
            }
        }
    }

    public void dealerPlays(){
        int handValue = getHandValue();
        if (handValue < 17){
            addCard(dealCard());
            dealerPlays();
        } else {
            compareHands();
        }
    }
    
    public void compareHands() {
        if (getHandValue() > 21) {
            System.out.println("Dealer Busts! You Win!!!");
            System.out.printf("Dealer's hand value = %d\nPlayers hand value = %d\n\n", getHandValue(), player.getHandValue());
            playAgain();
        } else if (getHandValue() >= player.getHandValue()){
            System.out.printf("You lose!\nDealer's hand value = %d\nPlayers hand value = %d\n\n", getHandValue(), player.getHandValue());
            playAgain();
        } else {
           System.out.printf("You win!\nDealer's hand value = %d\nPlayers hand value = %d\n\n", getHandValue(), player.getHandValue());
            playAgain();
        }
    }
    
    public void playAgain() {
        System.out.print("Would you like to play again? y/n ");
        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.next();
        if (answer.equals("y")) {
            System.out.printf("\nStarting new game.\nShuffling Deck...\n\n");
            startGame();
        } else {
            System.out.println("Thanks for playing!");
        }
    }
    
    
    @Override
    public int getHandValue() {
        return hand.getValue();
    }

}
