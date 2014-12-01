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
   private final int WINDOW_WIDTH = 1000;
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
   private JLabel warStatus;
   private ImageIcon cardPic;
   private ImageIcon cardPic2;
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
      cardPic = new ImageIcon("Card Pics//back.jpg");
      picture = new JLabel(cardPic);
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
      cardPic2 = new ImageIcon("Card Pics//back.jpg");
      picture2 = new JLabel(cardPic2);
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
      panel5.setLayout(new GridLayout(2,1));
      warStatus = new JLabel("", JLabel.CENTER);
      warStatus.setFont(new Font("SANS_SERIF",Font.PLAIN,20));
      panel5.add(warStatus);
      panel6 = new JPanel();
      panel6.setBackground(new Color (150,0,0));
      
       panel6.setLayout(new FlowLayout());
       panel5.add(panel6);

      add(panel5, BorderLayout.CENTER);
      
  
      setVisible(true);
      

      //create new deck
      Deck1 deck = new Deck1();
      
      //shuffle deck
      deck.shuffle();
      
      
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

      
      
      
      
      cardPic = pile1.get(0).getImageIcon();
      cardPic2 = pile2.get(0).getImageIcon();
        
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
         //panel6.removeAll();
         //panel5.removeAll();
         //warStatus.setText("");
         
         if (pile1.get(0).getRank() > pile2.get(0).getRank())
         {
            //panel6.add(pic1);
            //panel6.add(pic2);
            // JLabel text = new JLabel("panel7");
//             panel7.add(text);
//             panel8.add(text);
            warStatus.setText("");
           
            panel6.removeAll();
            //back.setIcon(null);
            //back2.setIcon(null);
            
            picture.setIcon(cardPic);
            picture2.setIcon(cardPic2);
            status.setText("Warrior 1 wins");
            
            Card card1 = pile1.remove(0);
            Card card2 = pile2.remove(0);
            pile1.add(card1);
            pile1.add(card2);
            
            
            cardPic = pile1.get(0).getImageIcon();
            cardPic2 = pile2.get(0).getImageIcon();
                                  
         }
         else if (pile1.get(0).getRank() < pile2.get(0).getRank())
         {
            //panel6.add(pic1);
            //panel6.add(pic2);
            // JLabel text = new JLabel("panel7");
//             panel7.add(text);
//             panel8.add(text);

            warStatus.setText("");
            panel6.removeAll();
            
            
            picture.setIcon(cardPic);
            picture2.setIcon(cardPic2);
            status.setText("Warrior 2 wins");
            
            Card card1 = pile1.remove(0);
            Card card2 = pile2.remove(0);
            pile2.add(card1);
            pile2.add(card2); 
            
            
            cardPic = pile1.get(0).getImageIcon();
            cardPic2 = pile2.get(0).getImageIcon(); 
                 
         }
         else if (pile1.get(0).getRank() == pile2.get(0).getRank())
         {
            picture.setIcon(cardPic);
            picture2.setIcon(cardPic2);
            warStatus.setText("There is a war");
            //warStatus.setFont(new Font("SANS_SERIF",Font.BOLD,30));
            //panel5.add(warStatus);
            back = new ImageIcon("Card Pics//back.jpg");
            pic1 = new JLabel(back);
            back2 = new ImageIcon("Card Pics//back.jpg");
            pic2 = new JLabel(back2);
            panel6.add(pic1);
            panel6.add(pile1.get(2).getPic());
            panel6.add(pile2.get(2).getPic());
            panel6.add(pic2);
            
            //panel7.add(picture);
            //panel7.add(picture2);
            
            
            
              
            
            
            status.setText("WAR!");
            boolean war = true;
            
            if (war = true)
            {
               
                              
               if (pile1.get(2).getRank() > pile2.get(2).getRank())
               {
                  status.setText("WAR! Warrior 1 wins");
                  Card card1 = pile1.remove(2);
                  Card card2 = pile2.remove(2);
                  //put down one card from pile 1
                  Card card3 = pile1.remove(1);
                  //put down one card from pile 2
                  Card card4 = pile2.remove(1);
                  Card card5 = pile1.remove(0);
                  Card card6 = pile2.remove(0);
                  
                  pile1.add(card1);
                  pile1.add(card2);
                  pile1.add(card3);
                  pile1.add(card4);
                  pile1.add(card5);
                  pile1.add(card6);
                  
                  //war = false;
  
               }
               
               else if (pile2.get(2).getRank() > pile1.get(2).getRank())
               {
                  status.setText("WAR! Warrior 2 wins");
                  Card card1 = pile1.remove(2);
                  Card card2 = pile2.remove(2);
                  //put down one card from pile 1
                  Card card3 = pile1.remove(1);
                  //put down one card from pile 2
                  Card card4 = pile2.remove(1);
                  Card card5 = pile1.remove(0);
                  Card card6 = pile2.remove(0);
                  
                  
                  pile2.add(card1);
                  pile2.add(card2);
                  pile2.add(card3);
                  pile2.add(card4);
                  pile1.add(card5);
                  pile1.add(card6);
                  
                  //war = false;
                  
               }
               
               else if (pile1.get(0).getRank() == pile2.get(0).getRank())
               {
                  status.setText("WAR UPON WAR!");
                  warStatus.setText("");
                  panel6.removeAll();
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
