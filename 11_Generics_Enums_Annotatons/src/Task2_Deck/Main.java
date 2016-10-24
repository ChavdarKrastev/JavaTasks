package Task2_Deck;

import Task1_Cards.*;

public class Main {

    public static void main(String[] args) {
        Card s = new Card();
        String[] deck = s.toString().split(" ");
        
        for(int i =0; i<deck.length;i++)
        {
            if(i%3==0)
            {
                System.out.println();
            }
        
            System.out.print(deck[i]+" ");
        }
        //System.out.print(s);
    }

}
