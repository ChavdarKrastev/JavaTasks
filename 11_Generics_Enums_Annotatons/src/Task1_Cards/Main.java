package Task1_Cards;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        for (cardSuit suit : cardSuit.values()) {
            if (cardSuit.values().length == count) {
                System.out.print(suit);
                System.out.println();
            } else {
                System.out.print(suit + ", ");
            }
            count++;
        }
        count = 1;
        for (CardRank rank : CardRank.values()) {

            if (CardRank.values().length == count) {
                System.out.print(rank);
                System.out.println();
            } else {
                System.out.print(rank + ", ");
            }
            count++;
        }
    }

}
