/* Madison Palmer
   CS 110
   Final Project
*/

//import
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
   This program simulates the card game war using GUI's
   @author Madison Palmer 
*/

public class WarGUI extends JFrame
{
   /** Size of window width. */
   private final int WINDOW_WIDTH = 1000;
   /** Size of window height. */
   private final int WINDOW_HEIGHT = 650;
   /** Panel */
   private JPanel panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8;
   /** Button */ 
   private JButton battleButton;
   /** The first pile of cards that were split in half from a deck. */ 
   private ArrayList<Card> pile1;
   /** The second pile of cards that were split in half from a deck. */
   private ArrayList<Card> pile2;
   /** JLabel */
   private JLabel battleStatus,gameStatus,warStatus;
   /** JLabel */
   private JLabel player1,player2;
   /** JLabel */
   private JLabel pic1,pic2;
   /** JLabel */
   private JLabel picture,picture2;
   /** ImageIcon */
   private ImageIcon cardPic,cardPic2;
   /** ImageIcon */
   private ImageIcon back,back2;
   
   /**
      The constructor sets up the window for the game
      using GUI's and simulates the card game.
   */
   
   public WarGUI()
   {
      //set size of window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      //set the window title
      setTitle("War - Card Game");
      //specify what happens when the close button is clicked
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //set layout
      setLayout(new BorderLayout());
      
      //display image of the first pile of cards in WEST
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
      //display image of the second pile of cards in EAST
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
            
      //create a button to flip over cards to battle
      panel3 = new JPanel();
      panel3.setBackground(new Color(0,0,50));
      battleButton = new JButton("BATTLE");
      battleButton.addActionListener(new ButtonListener());
      panel3.add(battleButton);
      add(panel3, BorderLayout.SOUTH);
      
      //add labels to the north region displaying directions 
      //and status of each battle and overall game
      panel4 = new JPanel();
      panel4.setBackground(new Color(0,100,0));
      panel4.setLayout(new GridLayout(3,1));
      JLabel directions = new JLabel("click the BATTLE button below to battle cards", JLabel.CENTER);
      directions.setFont(new Font("SANS_SERIF",Font.PLAIN,15));
      battleStatus = new JLabel("YOU JUST ENTERED THE BATTLEFIELD", JLabel.CENTER);
      battleStatus.setFont(new Font("SANS_SERIF",Font.BOLD,36));
      gameStatus = new JLabel("", JLabel.CENTER);
      gameStatus.setFont(new Font("SANS_SERIF",Font.PLAIN,20));
      panel4.add(battleStatus);
      panel4.add(gameStatus);
      panel4.add(directions);
      add(panel4, BorderLayout.NORTH);
      
      //set up the center panel 
      panel5 = new JPanel(); 
      panel5.setBackground(new Color (150,0,0));
      panel5.setLayout(new GridLayout(2,1));
      warStatus = new JLabel("", JLabel.CENTER);
      warStatus.setFont(new Font("SANS_SERIF",Font.PLAIN,30));
      panel5.add(warStatus); //add to first cell in grid
      panel6 = new JPanel(); //this panel will hold images of cards for when a war occurs
      panel6.setBackground(new Color (150,0,0));
      panel6.setLayout(new FlowLayout());
      panel5.add(panel6);
      add(panel5, BorderLayout.CENTER);

      setVisible(true);
      
      
      //create a new deck of cards
      Deck1 deck = new Deck1();
      
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

      //initialize the first card pictures
      cardPic = pile1.get(0).getImageIcon();
      cardPic2 = pile2.get(0).getImageIcon();
        
   }
   
   //when button is clicked
   class ButtonListener implements ActionListener
   {
      
      public void actionPerformed(ActionEvent e)
      {
         //if both piles have cards in their pile
         if (pile1.size() != 0 && pile2.size() != 0)
         {
            //if the top card of pile1 has a greater rank
            if (pile1.get(0).getRank() > pile2.get(0).getRank())
            {
               //clear cards in center i fa war occured before
               warStatus.setText("");
               panel6.removeAll();
               
               //show the top card of each pile that is compared          
               picture.setIcon(cardPic);
               picture2.setIcon(cardPic2);
               
               //show that pile1 won
               battleStatus.setText("Warrior 1 wins this Battle");
               
               //remove the two top cards and add to back of pile1
               Card card1 = pile1.remove(0);
               Card card2 = pile2.remove(0);
               pile1.add(card1);
               pile1.add(card2);
               
               //show update on which pile has more cards overall
               if (pile1.size() > pile2.size())
                  gameStatus.setText("Warrior 1 is winning (has more cards in its army)");
               else if (pile1.size() < pile2.size())
                  gameStatus.setText("Warrior 2 is winning (has more cards in its army)");
               else if (pile1.size() == pile2.size())
                  gameStatus.setText("Tie");
               
               //set the images to the next cards on top of each pile that will battle next
               cardPic = pile1.get(0).getImageIcon();
               cardPic2 = pile2.get(0).getImageIcon();
                                     
            }
            else if (pile1.get(0).getRank() < pile2.get(0).getRank())
            {
               //clear cards in center ifa war occured before
               warStatus.setText("");
               panel6.removeAll();
               
               //show the top card of each pile that is compared
               picture.setIcon(cardPic);
               picture2.setIcon(cardPic2);
               
               //show that pile2 won
               battleStatus.setText("Warrior 2 wins this Battle");
               
               //remove the two top cards and add to back of pile2
               Card card1 = pile1.remove(0);
               Card card2 = pile2.remove(0);
               pile2.add(card1);
               pile2.add(card2); 
               
               //show update on which pile has more cards overall
               if (pile1.size() > pile2.size())
                  gameStatus.setText("Warrior 1 is winning (has more cards in its army)");
               else if (pile1.size() < pile2.size())
                  gameStatus.setText("Warrior 2 is winning (has more cards in its army)");
               else if (pile1.size() == pile2.size())
                  gameStatus.setText("Tie");
               
               //set the images to the next cards on top of each pile that will battle next
               cardPic = pile1.get(0).getImageIcon();
               cardPic2 = pile2.get(0).getImageIcon(); 
                    
            }
            //if both cards have the same rank
            else if (pile1.get(0).getRank() == pile2.get(0).getRank())
            {
               //show the top card of each pile that is compared
               picture.setIcon(cardPic);
               picture2.setIcon(cardPic2);
               //show that a war occured
               warStatus.setText("War!");
               //show the the back of the cards put face down
               //and show the two cards battling in the war
               back = new ImageIcon("Card Pics//back.jpg");
               pic1 = new JLabel(back);
               back2 = new ImageIcon("Card Pics//back.jpg");
               pic2 = new JLabel(back2);
               panel6.add(pic1);
               panel6.add(pile1.get(2).getPic());
               panel6.add(pile2.get(2).getPic());
               panel6.add(pic2);
               
               boolean war = true;
               
               //if a war occurs
               if (war = true)
               {
                  //if pile1 has a greater rank after one card was placed face down    
                  if (pile1.get(2).getRank() > pile2.get(2).getRank())
                  {
                     //show that pile1 won
                     battleStatus.setText("WAR! Warrior 1 wins this Battle");
                     
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
                     
                     //show update on which pile has more cards overall
                     if (pile1.size() > pile2.size())
                        gameStatus.setText("Warrior 1 is winning (has more cards in its army)");
                     else if (pile1.size() < pile2.size())
                        gameStatus.setText("Warrior 2 is winning (has more cards in its army)");
                     else if (pile1.size() == pile2.size())
                        gameStatus.setText("Tie");
     
                  }
                  //if pile2 has a greater rank after one card is placed face down
                  else if (pile2.get(2).getRank() > pile1.get(2).getRank())
                  {
                     //show that pile2 won
                     battleStatus.setText("WAR! Warrior 2 wins this Battle");
                     
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
                     
                     //show update on which pile has more cards overall
                     if (pile1.size() > pile2.size())
                        gameStatus.setText("Warrior 1 is winning (has more cards in its army)");
                     else if (pile1.size() < pile2.size())
                        gameStatus.setText("Warrior 2 is winning (has more cards in its army)");
                     else if (pile1.size() == pile2.size())
                        gameStatus.setText("Tie");
                     
                  }
                  //if another war occurs
                  else if (pile1.get(2).getRank() == pile2.get(2).getRank())
                  {
                     battleStatus.setText("WAR UPON WAR!");
                     
                     //remove all cards involved to get ready for another war
                     Card card1 = pile1.remove(2);
                     Card card2 = pile2.remove(2);
                     Card card3 = pile1.remove(1);
                     Card card4 = pile2.remove(1);
                     Card card5 = pile1.remove(0);
                     Card card6 = pile2.remove(0);
                     
                     warStatus.setText("");
                     panel6.removeAll();
                     
                     war = true;
                  }
                  
               }
                              
               
            }  
         }
         //if one of the piles runs out of cards
         else
         {
            //pile2 wins if pile1 runs out of cards
            if (pile1.size() == 0)
            {
               battleStatus.setText("Pile2 wins. Pile1 ran out of cards.");
            }
            //pile1 wins if pile2 runs out of cards
            else if (pile2.size() == 0)
            {
               battleStatus.setText("Pile1 wins. Pile2 ran out of cards.");
            }
         } 
      }
   }

   public static void main(String[] args)
   {
      new WarGUI();
   }
          
   
}