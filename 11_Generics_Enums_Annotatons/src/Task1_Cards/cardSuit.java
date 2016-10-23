package Task1_Cards;

public enum cardSuit {

    Clubs(4),
    Diamonds(3),
    Hearts(2),
    Spades(1);

    private int suit;

    private cardSuit(int suit) {
        this.suit = suit;
    }

}
