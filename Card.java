/*Madison Palmer
CS 110
Card class*/

/*
   The Card class represents a single 
   playing card from a standard 52 card deck.
*/ 



//put pics with cards!!!!!!!!!!!!!!!!!!!!!
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Card
{   
   //initialize constants
   public final static int SPADES = 1;
   public final static int CLUBS = 2;
   public final static int HEARTS = 3;
   public final static int DIAMONDS = 4;
   public final static int JACK = 11;
   public final static int QUEEN = 12;
   public final static int KING = 13;
   public final static int ACE = 1;
   private int rank; //rank of card
   private int suit; //suit of card
   private JLabel pic;
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
      get pic of card
   */
   
   public JLabel getPic()
   {
      if ((rank == 1) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//aces.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 1) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//acec.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 1) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//aceh.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 1) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//aced.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 2) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//2s.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 2) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//2c.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 2) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//2h.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 2) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//2d.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 3) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//3s.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 3) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//3c.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 3) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//3h.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 3) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//3d.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 4) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//4s.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 4) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//4c.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 4) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//4h.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 4) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//4d.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 5) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//5s.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 5) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//5c.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 5) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//5h.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 5) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//5d.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 6) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//6s.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 6) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//6c.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 6) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//6h.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 6) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//6d.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 7) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//7s.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 7) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//7c.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 7) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//7h.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 7) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//7d.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 8) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//8s.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 8) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//8c.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 8) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//8h.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 8) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//8d.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 9) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//9s.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 9) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//9c.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 9) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//9h.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 9) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//9d.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 10) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//10s.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 10) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//10c.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 10) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//10h.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 10) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//10d.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 11) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//jacks.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 11) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//jackc.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 11) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//jackh.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 11) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//jackd.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 12) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//queens.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 12) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//queenc.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 12) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//queenh.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 12) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//queend.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 13) && (suit == 1))
      {
         front = new ImageIcon("Card Pics//kings.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 13) && (suit == 2))
      {
         front = new ImageIcon("Card Pics//kingc.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 13) && (suit == 3))
      {
         front = new ImageIcon("Card Pics//kingh.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      else if ((rank == 13) && (suit == 4))
      {
         front = new ImageIcon("Card Pics//kingd.jpg");
         // = new ImageIcon("Card Pics//back.jpg");
         pic = new JLabel(front);
      }
      
      return pic;
   }
      
   /**
      toString mehtod
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
      The equals method compares two Month objects.
      They are equal if they contain the same rank.
      @param other The other month that you are comparing to.
      @return True or False.
   */
   
   public boolean equals(Card otherCard)
   {
      if (rank == (otherCard.rank))
         return true;
      return false;
   }
   
}