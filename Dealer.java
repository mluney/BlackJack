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
    
    public Card dealCard() {
        return deck.getNextCard();
    }

    public void startGame(){
        System.out.printf("Starting new game.\nShuffling Deck...\n\n");
        player = new Player();
        deck.shuffle();
        player.addCard(dealCard());
        player.addCard(dealCard());
        addCard(dealCard());
        addCard(dealCard()); 
        
        hand.displayDealerStartHand();
        
        System.out.print("Player's ");
        player.getHand().displayHand();
        System.out.printf("Player's hand value = %d\n", player.getHandValue());
        hitOrStand();
    }
    
    public void hitOrStand() {
        Boolean flag = true ;
        Scanner keyboard = new Scanner(System.in);
        
        while(flag == true){
            System.out.print("Would you like to hit? y/n: ");
            String answer = keyboard.next();
            if(answer.equals("y")){
                player.addCard(dealCard());
                System.out.print("Player's ");
                player.getHand().displayHand();
                System.out.printf("Player's hand value = %d\n", player.getHandValue());
                if(player.getHandValue() > 21){
                    System.out.print("Bust! Would you like to play again? y/n: ");
                    answer = keyboard.next();
                    if(answer.equals("y")){
                        startGame();
                    } else {
                        System.out.println("Thanks for playing!");
                        flag = false;
                    }
                }
            } else {
                flag = false;
                System.out.println();
                dealerPlays();
            }
        }
    }

    public void dealerPlays(){
        int handValue = getHandValue();
        System.out.print("Dealer's ");
        hand.displayHand();
        System.out.printf("Dealer's hand value = %d\n", getHandValue());
        if (handValue < 17){
            System.out.printf("Dealer hits!\n\n");
            addCard(dealCard());
            dealerPlays();
        } else {
            System.out.println("Dealer stands!");
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
        System.out.print("Would you like to play again? y/n: ");
        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.next();
        if (answer.equals("y")) {
            startGame();
        } else {
            System.out.println("Thanks for playing!");
        }
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
