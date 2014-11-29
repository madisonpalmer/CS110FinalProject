/*
   This program simulates the card game war in COMMAND WINDOW!!!!!
*/
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class WarCW extends JFrame
{
   private final int WINDOW_WIDTH = 650;
   private final int WINDOW_HEIGHT = 600;
   private JPanel panel1;
   private JButton battleButton;
   private JFrame frame;
   //private JLabel picture;
   
   /**
      Constructor
   */
   
   public WarCW()
   {
      //set size of window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      //set the window title
      setTitle("War - Card Game");
      
      //specify what happens when the close button is clicked
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //display the two piles of cards
      JPanel panel1 = new JPanel();
      panel1.setBackground(Color.red);
      ImageIcon back = new ImageIcon("Card Pics//back.jpg");
      JLabel picture = new JLabel(back);
      panel1.add(picture);
      add(panel1, BorderLayout.EAST);
      setVisible(true);
      JPanel panel2 = new JPanel();
      panel2.setBackground(Color.red);
      ImageIcon back2 = new ImageIcon("Card Pics//back.jpg");
      JLabel picture2 = new JLabel(back2);
      panel2.add(picture2);
      add(panel2, BorderLayout.WEST);
      
      JPanel panel3 = new JPanel();
      panel3.setBackground(Color.blue);
      battleButton = new JButton("BATTLE");
      //battleButton.addActionListener(new ButtonListener());
      panel3.add(battleButton);
      add(panel3, BorderLayout.SOUTH);
      
      JPanel panel4 = new JPanel();
      panel4.setBackground(Color.green);
      JLabel title = new JLabel("War");
      title.setFont(new Font("HELVETICA",Font.ITALIC,36));
      panel4.add(title);
      add(panel4, BorderLayout.NORTH);


      setVisible(true);
      // setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
//       //setLayout(new BorderLayout());
//       //set the window title
//       setTitle("War - Card Game");
//       //specify what happens when the close button is clicked
//       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       JPanel outerPanel = new JPanel(new BorderLayout());
//       JPanel topPanel = new JPanel(new BorderLayout());
//       ImageIcon back = new ImageIcon("Card Pics//back.jpg");
//       ImageIcon back2 = new ImageIcon("Card Pics//back.jpg");
//       JLabel pic1 = new JLabel(back);
//       JLabel pic2 = new JLabel(back2);
//       topPanel.add(pic1);
//       outerPanel.add(pic2);
//       add(topPanel, BorderLayout.EAST);
//       add(outerPanel, BorderLayout.WEST);
//       
//       setVisible(true);
      
      
      
      
      
      // battleButton = new JButton("BATTLE");
//       //panel1.add(battleButton);
//       add(battleButton, BorderLayout.SOUTH);
      
      //create new deck
      Deck1 deck = new Deck1();
      
      //shuffle deck
      deck.shuffle();
      //JLabel picture = deck.dealCard().getPic();
      //add(deck.dealCard().getPic());
      //System.out.println(deck.cardsRemaining());
      //System.out.println("**********************");
      
      // while (!(deck.isEmpty()))
//          System.out.println(deck.dealCard().toString());
      
      //split deck in half
      ArrayList<Card> pile1 = new ArrayList<Card>();
      ArrayList<Card> pile2 = new ArrayList<Card>();
      
      
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
      
      
      // for (int index = 0; index < pile1.size(); index++)
//       {
//          add(pile1.get(index).getPic(), BorderLayout.EAST);
//       }
      
      // for (int index = 0; index < pile1.size(); index++)
//          System.out.println(pile1.get(index));
//          
//       System.out.println("**************************");
//       
//       for (int index = 0; index < pile2.size(); index++)
//          System.out.println(pile2.get(index));
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Do you want to battle? (y/n) ");
      String answer = keyboard.nextLine();
      
      if (answer.equalsIgnoreCase("n"))
      {
         System.out.println("Goodbye!");
         System.exit(0);
      }
      
      while ((!answer.equalsIgnoreCase("n"))) 
      {
         
         if (answer.equalsIgnoreCase("y"))
         {
            //if they dont equal each other
            if (pile1.get(0).getRank() != pile2.get(0).getRank())
            { 
               
               if (pile1.get(0).getRank() > pile2.get(0).getRank())
               {
                  System.out.println("Card 1 for battle: " + pile1.get(0).toString());
                  System.out.println("Card 2 for battle: " + pile2.get(0).toString());
                  
                  System.out.println("Card 1 wins");
                  Card card1 = pile1.remove(0);
                  Card card2 = pile2.remove(0);
                  
                  pile1.add(card1);
                  pile1.add(card2);
                  
                  System.out.println("Pile1 : " + pile1.size());
                  System.out.println("Pile2 : " + pile2.size());
                  
                  System.out.print("Do you want to battle? (y/n) ");
                  answer = keyboard.nextLine();
               }
               else if (pile2.get(0).getRank() > pile1.get(0).getRank())
               {
                  System.out.println("Card 1 for battle: " + pile1.get(0).toString());
                  System.out.println("Card 2 for battle: " + pile2.get(0).toString());
                  System.out.println("Card 2 wins");
                  Card card1 = pile2.remove(0);
                  Card card2 = pile1.remove(0);
                  
                  pile2.add(card1);
                  pile2.add(card2);
                  
                  System.out.println("Pile1 : " + pile1.size());
                  System.out.println("Pile2 : " + pile2.size());
                  
                  System.out.print("Do you want to battle? (y/n) ");
                  answer = keyboard.nextLine();
               
               }
            }
            else
            {
               System.out.println("Card 1 for battle: " + pile1.get(0).toString());
               System.out.println("Card 2 for battle: " + pile2.get(0).toString());
               System.out.println("WAR!! same rank");
               boolean war = true;
               
               
               if (war = true)
               {
                  System.out.println("Put down 1 card and flip second one over to battle");
                  Card card1 = pile1.remove(0);
                  //System.out.println("Card flipped pile 1: " + card1);
                  //Card card2 = pile2.remove(0);
                  System.out.println("Card 1 to battle: " + pile1.get(0).toString());
                  Card card2 = pile2.remove(0);
                  //System.out.println("Card flipped pile 2: " + card3);
                  //Card card4 = pile2.remove(0);
                  System.out.println("Card 2 to battle: " + pile2.get(0).toString());
                  
                  if (pile1.get(0).getRank() > pile2.get(0).getRank())
                  {
                     //war = false;
                     System.out.println("Card 1 wins");
                     Card card3 = pile1.remove(0);
                     Card card4 = pile2.remove(0);
                     
                     pile1.add(card1);
                     pile1.add(card2);
                     pile1.add(card3);
                     pile1.add(card4);
                     
                     
                     System.out.println("Pile1 : " + pile1.size());
                     System.out.println("Pile2 : " + pile2.size());
                     System.out.print("Do you want to battle? (y/n) ");
                     answer = keyboard.nextLine();
                     //war = false;
                  }
                  
                  else if (pile2.get(0).getRank() > pile1.get(0).getRank())
                  {
                     //war = false;
                     System.out.println("Card 2 wins");
                     Card card3 = pile2.remove(0);
                     Card card4 = pile1.remove(0);
                     
                     pile2.add(card1);
                     pile2.add(card2);
                     pile2.add(card3);
                     pile2.add(card4);
                     
                     
                     System.out.println("Pile1 : " + pile1.size());
                     System.out.println("Pile2 : " + pile2.size());
                     
                     System.out.print("Do you want to battle? (y/n) ");
                     answer = keyboard.nextLine();
                     //war = false;
                  }
                  
                  else if (pile1.get(0).getRank() == pile2.get(0).getRank())
                  {
                     System.out.println("Another WAR!!");
                     war = true;
                  }
               //war = false;   
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
