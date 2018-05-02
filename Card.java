package blackjack;

public class Card {
//*********************Just Testing************
    private String name;
    private int cardValue;
    private String suit;

    public Card(String name, int cardValue, String suit){
        this.name = name;
        this.cardValue = cardValue;
        this.suit = suit;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return cardValue;
    }

    public String getSuit() {
        return suit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int cardValue) {
        this.cardValue = cardValue;
    }
}
