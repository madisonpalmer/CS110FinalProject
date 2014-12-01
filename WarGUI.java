/* Madison Palmer
   CS 110
   Final Project
*/

/**
   This program simulates the card game war using GUI's
   
   @author Madison Palmer 
*/
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class WarGUI extends JFrame
{
   //initialize window size constants
   private final int WINDOW_WIDTH = 800;
   private final int WINDOW_HEIGHT = 600;
   
   private JPanel panel1;
   private JPanel panel2;
   private JPanel panel3;
   private JPanel panel4;
   private JPanel panel5;
   private JPanel panel6;
   private JPanel panel7;
   private JPanel panel8;
   private JButton battleButton;
   private ArrayList<Card> pile1;
   private ArrayList<Card> pile2;
   private JLabel status;
   private JLabel player1;
   private JLabel player2;
   private JPanel topPanel;
   private JPanel outerPanel;
   private JLabel pic1;
   private JLabel pic2;
   private JLabel picture;
   private JLabel picture2;
   private ImageIcon back;
   private ImageIcon back2;
   //private JLabel picture;
   
   /**
      The constructor sets up the window for the game
      and splits a deck of cards into two equal piles.
   */
   
   public WarGUI()
   {
      //set size of window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      //set the window title
      setTitle("War - Card Game");
      //specify what happens when the close button is clicked
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      //display images of the two piles of cards
      panel1 = new JPanel();
      panel1.setBackground(new Color(150,0,0));
      panel1.setLayout(new GridLayout(2,1));
      player1 = new JLabel("Warrior 1", JLabel.CENTER);
      player1.setFont(new Font("SANS_SERIF",Font.BOLD,30));
      back = new ImageIcon("Card Pics//back.jpg");
      picture = new JLabel(back);
      panel1.add(player1);
      panel1.add(picture);
      add(panel1, BorderLayout.WEST);
      setVisible(true);
      
      panel2 = new JPanel();
      panel2.setBackground(new Color(150,0,0));
      panel2.setLayout(new GridLayout(2,1));
      player2 = new JLabel("Warrior 2", JLabel.CENTER);
      player2.setFont(new Font("SANS_SERIF",Font.BOLD,30));
      panel2.add(player2);
      back2 = new ImageIcon("Card Pics//back.jpg");
      picture2 = new JLabel(back);
      panel2.add(picture2);
      
      add(panel2, BorderLayout.EAST);
      
      setVisible(true);
            
      //create a button to battle two cards
      panel3 = new JPanel();
      panel3.setBackground(new Color(0,0,50));
      battleButton = new JButton("BATTLE");
      battleButton.addActionListener(new ButtonListener());
      panel3.add(battleButton);
      add(panel3, BorderLayout.SOUTH);
      
      //add a label to the north region of window
      panel4 = new JPanel();
      panel4.setBackground(new Color(0,100,0));
      panel4.setLayout(new GridLayout(2,1));
      JLabel directions = new JLabel("click the button below to battle cards", JLabel.CENTER);
      directions.setFont(new Font("SANS_SERIF",Font.PLAIN,20));
      status = new JLabel("YOU JUST ENTERED THE BATTLEFIELD", JLabel.CENTER);
      status.setFont(new Font("SANS_SERIF",Font.BOLD,36));
      panel4.add(status);
      panel4.add(directions);
      add(panel4, BorderLayout.NORTH);
      
      
      //create center panel 
      panel5 = new JPanel();
      panel5.setBackground(new Color (150,0,0));
      panel5.setLayout(new GridLayout(3,1));
      add(panel5, BorderLayout.CENTER);
      
      panel6 = new JPanel();
      panel6.setBackground(new Color (150,0,0));
      panel6.setLayout(new FlowLayout());
      add(panel6);
      
      panel7 = new JPanel();
      panel7.setBackground(new Color (150,0,0));
      panel7.setLayout(new FlowLayout());
      add(panel7);
      
      panel8 = new JPanel();
      panel8.setBackground(new Color (150,0,0));
      panel8.setLayout(new FlowLayout());
      add(panel8);
      
      
      
     
      // int i = 1;
//       int j = 6;
//       panel5 = new JPanel[i][j]; 
//       setBackground(new Color(150,0,0));
//       setLayout(new GridLayout(i,j));
// 
//       // for(int m = 0; m < i; m++) 
//       {
//          for(int n = 0; n < j; n++) 
//          {
//             panel5[m][n] = new JPanel();
//             add(panel5[m][n]);
//          }
//       }
      
   
      
      //topPanel.add(pile1.get(0).getPic(), BorderLayout.BEFORE_LINE_BEGINS);
      //topPanel.add(pile2.get(0).getPic(), BorderLayout.CENTER);
      //outerPanel.add(topPanel, BorderLayout.BEFORE_FIRST_LINE);
      
      


      setVisible(true);
      

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
      pile1 = new ArrayList<Card>();
      pile2 = new ArrayList<Card>();
      
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
      
      
      
      pic1 = pile1.get(0).getPic();
      pic2 = pile2.get(0).getPic();
        
   }
   
   class ButtonListener implements ActionListener
   {
      
      public void actionPerformed(ActionEvent e)
      {
         //display the top cards of each pile that will battle
         
         // panel5.add(pic1);
//          panel5.add(pic2);

         // topPanel.add(pile1.get(0).getPic(), BorderLayout.BEFORE_LINE_BEGINS);
//          topPanel.add(pile2.get(0).getPic(), BorderLayout.CENTER);
//          outerPanel.add(topPanel, BorderLayout.BEFORE_FIRST_LINE);
         panel5.removeAll();
         
         if (pile1.get(0).getRank() > pile2.get(0).getRank())
         {
            panel6.add(pic1);
            panel6.add(pic2);
            
            status.setText("Warrior 1 wins");
            
            Card card1 = pile1.remove(0);
            Card card2 = pile2.remove(0);
            pile1.add(card1);
            pile1.add(card2);
            
            pic1 = pile1.get(0).getPic();
            pic2 = pile2.get(0).getPic();
                                  
         }
         else if (pile1.get(0).getRank() < pile2.get(0).getRank())
         {
            panel6.add(pic1);
            panel6.add(pic2);
            
            status.setText("Warrior 2 wins");
            
            Card card1 = pile1.remove(0);
            Card card2 = pile2.remove(0);
            pile2.add(card1);
            pile2.add(card2); 
            
            pic1 = pile1.get(0).getPic();
            pic2 = pile2.get(0).getPic(); 
                 
         }
         else if (pile1.get(0).getRank() == pile2.get(0).getRank())
         {
            panel6.add(pic1);
            panel6.add(pic2);
            
            panel7.add(picture);
            panel7.add(picture2);
            
            
            
              
            
            
            status.setText("WAR!");
            boolean war = true;
            
            if (war = true)
            {
               //put down one card from pile 1
               Card card1 = pile1.remove(0);
               //put down one card from pile 2
               Card card2 = pile2.remove(0);
                              
               if (pile1.get(0).getRank() > pile2.get(0).getRank())
               {
                  status.setText("Warrior 1 wins");
                  Card card3 = pile1.remove(0);
                  Card card4 = pile2.remove(0);
                  
                  pile1.add(card1);
                  pile1.add(card2);
                  pile1.add(card3);
                  pile1.add(card4);
  
               }
               
               else if (pile2.get(0).getRank() > pile1.get(0).getRank())
               {
                  status.setText("Pile 2 wins");
                  Card card3 = pile2.remove(0);
                  Card card4 = pile1.remove(0);
                  
                  pile2.add(card1);
                  pile2.add(card2);
                  pile2.add(card3);
                  pile2.add(card4);
                  
               }
               
               else if (pile1.get(0).getRank() == pile2.get(0).getRank())
               {
                  status.setText("WAR!");
                  war = true;
               }
              
            }
               
            
         }  
         //setVisible(false);
         
      }
   }

      
   
   
   public static void main(String[] args)
   {
      new WarGUI();
   }
      
            
      
   
}
