/* Madison Palmer
   CS 110
   Final Project WarCW class
*/

//import
import java.util.ArrayList;
import java.util.Scanner;

/**
   The WarCW class simulates the card game war in the command window.
   @author Madison Palmer
*/

public class WarCW
{
   /** The deck of cards */
   private Deck1 deck;
   /** The first pile of cards from the Deck */
   private ArrayList<Card> pile1;
   /** The second pile of carde from the Deck */
   private ArrayList<Card> pile2;
   
   
   /**
      The constructor simulates the card game war.
   */
   
   public WarCW()
   {
      //create new deck
      deck = new Deck1();
      
      //shuffle deck
      deck.shuffle();
      
      //create two array lists to two hold the two 
      //separate piles after deck has been split
      pile1 = new ArrayList<Card>();
      pile2 = new ArrayList<Card>();
      
      //split deck in half
      for (int index = 0; index < deck.CARDS_IN_DECK; index++)
      {
         if (index % 2 == 0)
         {
            pile1.add(deck.dealCard());
         }
         else 
         {
            pile2.add(deck.dealCard());
         }
      }
      
      //ask user if they would like to battle the cards
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Do you want to battle? (y/n) ");
      String answer = keyboard.nextLine();
      
      //exit if they answer no
      if (answer.equalsIgnoreCase("n"))
      {
         System.out.println("Goodbye!");
         System.exit(0);
      }
      
      //while user keeps entering y
      while ((!answer.equalsIgnoreCase("n"))) 
      {
         
         if (answer.equalsIgnoreCase("y"))
         {
            //if both piles have cards
            if (pile1.size() != 0 && pile2.size() != 0)
            {
               //if they dont equal each other
               if (pile1.get(0).getRank() != pile2.get(0).getRank())
               { 
                  //if the top card of pile1 is greater
                  if (pile1.get(0).getRank() > pile2.get(0).getRank())
                  {
                     System.out.println("Card 1 for battle: " + pile1.get(0).toString());
                     System.out.println("Card 2 for battle: " + pile2.get(0).toString());
                     
                     System.out.println("Card 1 wins");
                     
                     //remove the cards and add them to back of pile1
                     Card card1 = pile1.remove(0);
                     Card card2 = pile2.remove(0);
                     pile1.add(card1);
                     pile1.add(card2);
                     
                     System.out.println("Size of Pile1 : " + pile1.size());
                     System.out.println("Size of Pile2 : " + pile2.size() + "\n");
                     
                     System.out.print("Do you want to battle? (y/n) ");
                     answer = keyboard.nextLine();
                     
                  }
                  //if the top card of pile2 is greater
                  else if (pile2.get(0).getRank() > pile1.get(0).getRank())
                  {
                     System.out.println("Card 1 for battle: " + pile1.get(0).toString());
                     System.out.println("Card 2 for battle: " + pile2.get(0).toString());
                     System.out.println("Card 2 wins");
                     
                     //remove the cards and add them to back of pile2 
                     Card card1 = pile2.remove(0);
                     Card card2 = pile1.remove(0);
                     pile2.add(card1);
                     pile2.add(card2);
                     
                     System.out.println("Size of Pile1 : " + pile1.size());
                     System.out.println("Size of Pile2 : " + pile2.size() + "\n");
                     
                     System.out.print("Do you want to battle? (y/n) ");
                     answer = keyboard.nextLine();
                  
                  }
               }
               //if ranks equal each other
               else
               {
                  System.out.println("Card 1 for battle: " + pile1.get(0).toString());
                  System.out.println("Card 2 for battle: " + pile2.get(0).toString());
                  System.out.println("WAR!! The cards have the same rank");
                  boolean war = true;
                  
                  
                  if (war = true)
                  {
                     System.out.println("Putting down 1 card and flipping second card over to battle");
                     System.out.println("Card 1 to battle: " + pile1.get(2).toString());                  
                     System.out.println("Card 2 to battle: " + pile2.get(2).toString());
                     
                     //if pile1 card has greater rank
                     if (pile1.get(2).getRank() > pile2.get(2).getRank())
                     {
                        System.out.println("Card 1 wins");
                        
                        //remove all cards involved
                        Card card1 = pile1.remove(2);
                        Card card2 = pile2.remove(2);
                        Card card3 = pile1.remove(1);
                        Card card4 = pile2.remove(1);
                        Card card5 = pile1.remove(0);
                        Card card6 = pile2.remove(0);
                        
                        //add all cards to pile1
                        pile1.add(card1);
                        pile1.add(card2);
                        pile1.add(card3);
                        pile1.add(card4);
                        pile1.add(card5);
                        pile1.add(card6);
                        
                        
                        System.out.println("Size of Pile1 : " + pile1.size());
                        System.out.println("Size of Pile2 : " + pile2.size() + "\n");
                        
                        System.out.print("Do you want to battle? (y/n) ");
                        answer = keyboard.nextLine();
                        
                     }
                     
                     //if pile2 card has a greater rank
                     else if (pile2.get(2).getRank() > pile1.get(2).getRank())
                     {
                        System.out.println("Card 2 wins");
                        
                        //remove all cards involved
                        Card card1 = pile1.remove(2);
                        Card card2 = pile2.remove(2);
                        Card card3 = pile1.remove(1);
                        Card card4 = pile2.remove(1);
                        Card card5 = pile1.remove(0);
                        Card card6 = pile2.remove(0);
                        
                        //add all cards to pile2
                        pile2.add(card1);
                        pile2.add(card2);
                        pile2.add(card3);
                        pile2.add(card4);
                        pile2.add(card5);
                        pile2.add(card6);
                        
                        System.out.println("Size of Pile1 : " + pile1.size());
                        System.out.println("Size of Pile2 : " + pile2.size() + "\n");
                        
                        System.out.print("Do you want to battle? (y/n) ");
                        answer = keyboard.nextLine();
                        
                     }
                     
                     //if ranks equal each other again
                     else if (pile1.get(2).getRank() == pile2.get(2).getRank())
                     {
                        System.out.println("Another WAR!!");
                        
                        //remove all cards involved
                        Card card1 = pile1.remove(2);
                        Card card2 = pile2.remove(2);
                        Card card3 = pile1.remove(1);
                        Card card4 = pile2.remove(1);
                        Card card5 = pile1.remove(0);
                        Card card6 = pile2.remove(0);
                        
                        war = true;
                     }
                     
                  }
                  
               }
            }
            //if one of the piles has 0 cards
            else
            {
               //pile2 wins if pile1 runs out of cards
               if (pile1.size() == 0)
               {
                  System.out.println("Pile2 wins. Pile1 ran out of cards.");
               }
               //pile1 wins if pile2 rins out of cards
               else if (pile2.size() == 0)
               {
                  System.out.println("Pile1 wins. Pile2 ran out of cards.");
               }
            }
         }   
         
         //validate user input
         else 
         {
            System.out.println("Invalid input. Please enter y or n");
            System.out.print("Do you want to battle? (y/n): ");
            answer = keyboard.nextLine();
         }
         
         
         
      }

   }
   
   
   public static void main(String[] args)
   {
      new WarCW();
   }
      
 
}