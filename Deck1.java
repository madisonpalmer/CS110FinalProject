/* Madison Palmer
   CS 110
   Final Project Deck class
*/

/**
   The Deck1 class extends the CardPile class and
   represents a deck of cards.  
   Initialized to a standard 52 card deck. 
 
   @author Madison Palmer
 */
 
import java.util.Random;
import java.util.ArrayList;
public class Deck1 extends CardPile
{
   /** 
      Number of cards in standard deck {@value #CARDS_IN_DECK}
   **/
   final static int CARDS_IN_DECK = 52;

   /** The collection of Cards */
   private ArrayList<Card> deck;
   
   /**
     This constructor constructs a regular 52-card deck.  
     Initially, the cards are in a sorted order.    
   */
    
   public Deck1()
   {
      freshDeck();
   }
   
   /**
      The freshDeck method creates a new 
      collection of 52 cards, in sorted order.
   */
    
   public void freshDeck()
   {
      deck = new ArrayList<Card>();
      

      for (int r = Card.ACE; r<=Card.KING;r++)
      {
         for (int s=Card.SPADES;s<=Card.DIAMONDS;s++)
         {
           deck.add(new Card(r,s));
         }
      }
     
   
   }
   
   /** 
      The dealCard method removes and returns the top Card on the Deck.
      @return A reference to a Card that was top on the Deck.
   */
   
   public Card dealCard()
   {
      Card c = deck.remove(0);  //  remove it (returns removed object)
      return c;
   }
   
   /** 
     The cardsRemaining method returns the 
     current number of Cards in Deck.
     @return number of Cards in Deck
   */

   public int cardsRemaining()
   {  
      return deck.size();
   }
   
   /** 
     The shuffle method randomizes the order of Cards in Deck.
   */

   public void shuffle()
   {
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 0; i < deck.size(); i++)
      {
         randNum = r.nextInt(deck.size());
         temp = deck.get(i);
         deck.set(i,deck.get(randNum));
         deck.set(randNum,temp);
      }      
   }
   
   /** 
     The isEmpty method determines if Deck is empty.
     @return true if there are no more cards, false otherwise.
   */
   
   public boolean isEmpty()
   {
      return (deck.size() == 0);
   }
   
   /**
      The displayDeck method displays all cards 
      in the deck in the command window.
   */
   
   public void displayDeck()
   {
      for (int index = 0; index < deck.size(); index++)
         System.out.println(deck.get(index));
   }
   
}
