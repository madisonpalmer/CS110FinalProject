import java.util.ArrayList;
import java.util.Random;
public class CardPile
{
   ArrayList<Card> cardPile = new ArrayList<Card>();
   
   public CardPile()
   {
        
   }
   
    
   
   
   public void addCard(Card c)
   {
      cardPile.add(c);
   }
   
   public void removeCard(Card c)
   {
      cardPile.remove(c);
   }
   
   public void displayPile()
   {
      for (int index = 0; index < cardPile.size(); index++)
         System.out.println(cardPile.get(index));
   }
   
   public static void main(String[] args)
   {
      CardPile pile1 = new CardPile();
      Card card = new Card(4,3);
      Card card2 = new Card(6,1);
      pile1.addCard(card);
      pile1.addCard(card2);
      pile1.displayPile();
      System.out.println("*******");
      pile1.removeCard(card2);
      pile1.displayPile();  
   }
   
}