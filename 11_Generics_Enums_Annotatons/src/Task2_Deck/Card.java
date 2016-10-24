
package Task2_Deck;

import Task1_Cards.CardRank;
import Task1_Cards.cardSuit;


public class Card  implements Comparable<Card>{
    
    @Override
    public String toString()
    {
       String suitRank = "";
        String s = "";
        int count = 0;
       for (cardSuit suit : cardSuit.values()) {
           
             s += (suit + " ");
             count++;
        }
       
       String[] splitted = s.split(" ");
       s = "";
      count = 4;
       for (int i=count;i>0;i--)
     {
         s = "";
       for (CardRank rank : CardRank.values()) {
           
             s += (rank + " of "+ splitted[i-1]+ " "); 
             
        }
        suitRank+=s;
       
       
    }
       return suitRank;
    }

    @Override
    public int compareTo(Card o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
