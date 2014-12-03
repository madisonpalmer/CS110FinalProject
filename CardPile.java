/* Madison Palmer
   CS 110
   Final Project
*/

/**
   The CardPile class represents a pile of cards.
   
   @author Madison Palmer
*/

import java.util.ArrayList;
import java.util.Random;
public class CardPile 
{
   /** The pile of cards */
   private ArrayList<Card> cardPile;
   
   /**
      This constrctor initializes the cardPile field.
   */
   
   public CardPile()
   {
      cardPile = new ArrayList<Card>();   
   }
   
   /**
      The addCard method adds a card to a pile.
      @param c The card to add.
   */
   
   public void addCard(Card c)
   {
      cardPile.add(c);
   }
   
   /**
      The removeCard method removes a card from a pile.
      @param c The card to remove.
   */
   
   public void removeCard(Card c)
   {
      cardPile.remove(c);
   }
   
   /**
      The displayPile method displays all 
      cards in a pile to the command window.
   */
   
   public void displayPile()
   {
      for (int index = 0; index < cardPile.size(); index++)
         System.out.println(cardPile.get(index));
   }
   
   
}