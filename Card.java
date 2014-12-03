/* Madison Palmer
   CS 110
   Final Project Card class*/

//import
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   The Card class represents a single 
   playing card from a standard 52 card deck.
   
   @author Madison Palmer
*/ 

public class Card
{   
   /** The number associated with the suit Spades. */
   public final static int SPADES = 1;
   /** The number associated with the suit Clubs. */
   public final static int CLUBS = 2;
   /** The number associated with the suit Hearts. */
   public final static int HEARTS = 3;
   /** The number associated with the suit Diamonds. */
   public final static int DIAMONDS = 4;
   /** The rank associated with Jack. */
   public final static int JACK = 11;
   /** The rank associated with Queen. */
   public final static int QUEEN = 12;
   /** The rank associated with King. */
   public final static int KING = 13;
   /** The rank associated with Ace. */
   public final static int ACE = 1;
   /** The rank of the card. */
   private int rank; 
   /** The suit of the card. */
   private int suit; 
   
   /** The picture of a card as a JLabel. */
   private JLabel pic;
   /** The ImageIcon of a card. */
   private ImageIcon front,back; 
 
   /**
      This constructor initializes the 
      suit and rank of the card.
      @param s The suit of the card.
      @param r The rank of the card.
   */
   
   public Card(int r, int s)
   {
      rank = r;
      suit = s;
   }
   
   /**
      The getSuit method returns the suit of the card.
      @return The suit of the card.
   */
   
   public int getSuit()
   {
      return suit;
   }
   
   /**
      The getRank method returns the rank of the card.
      @return The rank of the card.
   */
   
   public int getRank()
   {
      return rank;
   }
   
   /**
      The stringSuit method returns the suit as a string.
      @return The suit as a String.
   */
   
   public String stringSuit()
   {
      if (suit == 1)
         return "Spades";
      
      else if (suit == 2)
         return "Clubs";
         
      else if (suit == 3)
         return "Hearts";
         
      else if (suit == 4)
         return "Diamonds";
      else
         return "invalid suit";
   } 
   
   /**
      The stringRank method returns the rank as a String.
      @return The rank as a String.
   */
   
   public String stringRank()
   {
      if (rank == 1)
         return "Ace";
         
      else if (rank == 11)
         return "Jack";
         
      else if (rank == 12)
         return "Queen";
         
      else if (rank == 13)
         return "King";
      
      else
         return "invalid rank";
   }
   
  /**
      The getImageIcon method returns the picture of a card
      as an ImageIcon.
      @return The picture of the card as an ImageIcon.
   */
   
   public ImageIcon getImageIcon()
   {
      if ((rank == 1) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//aces.jpg");
      }
      else if ((rank == 1) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//acec.jpg");
      }
      else if ((rank == 1) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//aceh.jpg");
      }
      else if ((rank == 1) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//aced.jpg");
      }
      else if ((rank == 2) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//2s.jpg");
      }
      else if ((rank == 2) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//2c.jpg");
      }
      else if ((rank == 2) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//2h.jpg");
      }
      else if ((rank == 2) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//2d.jpg");
      }
      else if ((rank == 3) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//3s.jpg");
      }
      else if ((rank == 3) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//3c.jpg");
      }
      else if ((rank == 3) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//3h.jpg");
      }
      else if ((rank == 3) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//3d.jpg");
      }
      else if ((rank == 4) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//4s.jpg");
      }
      else if ((rank == 4) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//4c.jpg");
      }
      else if ((rank == 4) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//4h.jpg");
      }
      else if ((rank == 4) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//4d.jpg");
      }
      else if ((rank == 5) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//5s.jpg");
      }
      else if ((rank == 5) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//5c.jpg");
      }
      else if ((rank == 5) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//5h.jpg");
      }
      else if ((rank == 5) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//5d.jpg");
      }
      else if ((rank == 6) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//6s.jpg");
      }
      else if ((rank == 6) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//6c.jpg");
      }
      else if ((rank == 6) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//6h.jpg");
      }
      else if ((rank == 6) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//6d.jpg");
      }
      else if ((rank == 7) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//7s.jpg");
      }
      else if ((rank == 7) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//7c.jpg");
      }
      else if ((rank == 7) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//7h.jpg");
      }
      else if ((rank == 7) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//7d.jpg");
      }
      else if ((rank == 8) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//8s.jpg");
      }
      else if ((rank == 8) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//8c.jpg");
      }
      else if ((rank == 8) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//8h.jpg");
      }
      else if ((rank == 8) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//8d.jpg");
      }
      else if ((rank == 9) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//9s.jpg");
      }
      else if ((rank == 9) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//9c.jpg");
      }
      else if ((rank == 9) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//9h.jpg");
      }
      else if ((rank == 9) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//9d.jpg");
      }
      else if ((rank == 10) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//10s.jpg");
      }
      else if ((rank == 10) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//10c.jpg");
      }
      else if ((rank == 10) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//10h.jpg");
      }
      else if ((rank == 10) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//10d.jpg");
      }
      else if ((rank == 11) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//jacks.jpg");
      }
      else if ((rank == 11) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//jackc.jpg");
      }
      else if ((rank == 11) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//jackh.jpg");
      }
      else if ((rank == 11) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//jackd.jpg");
      }
      else if ((rank == 12) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//queens.jpg");
      }
      else if ((rank == 12) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//queenc.jpg");
      }
      else if ((rank == 12) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//queenh.jpg");
      }
      else if ((rank == 12) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//queend.jpg");
      }
      else if ((rank == 13) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//kings.jpg");
      }
      else if ((rank == 13) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//kingc.jpg");
      }
      else if ((rank == 13) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//kingh.jpg");
      }
      else if ((rank == 13) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//kingd.jpg");
      }
      
      return front;
   }
   /**
      The getPic method returns the picture of a card
      as a JLabel.
      @return The picture of the card as a JLabel.
   */
   
   public JLabel getPic()
   {
      if ((rank == 1) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//aces.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 1) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//acec.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 1) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//aceh.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 1) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//aced.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 2) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//2s.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 2) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//2c.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 2) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//2h.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 2) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//2d.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 3) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//3s.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 3) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//3c.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 3) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//3h.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 3) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//3d.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 4) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//4s.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 4) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//4c.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 4) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//4h.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 4) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//4d.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 5) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//5s.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 5) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//5c.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 5) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//5h.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 5) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//5d.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 6) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//6s.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 6) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//6c.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 6) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//6h.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 6) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//6d.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 7) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//7s.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 7) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//7c.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 7) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//7h.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 7) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//7d.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 8) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//8s.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 8) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//8c.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 8) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//8h.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 8) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//8d.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 9) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//9s.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 9) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//9c.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 9) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//9h.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 9) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//9d.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 10) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//10s.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 10) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//10c.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 10) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//10h.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 10) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//10d.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 11) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//jacks.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 11) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//jackc.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 11) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//jackh.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 11) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//jackd.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 12) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//queens.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 12) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//queenc.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 12) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//queenh.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 12) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//queend.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 13) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//kings.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 13) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//kingc.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 13) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//kingh.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 13) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//kingd.jpg");
         pic = new JLabel(front);
      }
      
      return pic;
   }
      
   /**
      toString method
      @return A string indicating 
              the object's suit and rank.
   */
   
   public String toString()
   {
      String s;
      if ((rank == ACE) || (rank >= JACK))
      {
         s = stringRank() + " of " + stringSuit();
         return s;
      }
      else
      {
         s = getRank() + " of " + stringSuit();
         return s;
      }
   }
   
   /**
      The equals method compares two Card objects.
      They are equal if they contain the same rank.
      @param otherCard The other card that you are comparing to.
      @return True or False.
   */
   
   public boolean equals(Card otherCard)
   {
      if (rank == (otherCard.rank))
         return true;
      return false;
   }
   
   /**
      The isGreater method compares two Card objects
      and determines which card has the higher rank.
      @param card1 The first card to compare.
      @param card2 The second card to compare.
      @return True if the first card has the higher rank.
              False if the first card does not have the higher rank.
   */
   
   public boolean isGreater(Card card1, Card card2)
   {
      if (card1.getRank() > card2.getRank())
         return true;
      else
         return false;
   }
   
}