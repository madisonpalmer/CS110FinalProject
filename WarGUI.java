/*
   This program simulates the card game war in COMMAND WINDOW!!!!!
*/
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class WarGUI extends JFrame
{
   private final int WINDOW_WIDTH = 800;
   private final int WINDOW_HEIGHT = 600;
   private JPanel panel1;
   private JButton battleButton;
   private JFrame frame;
   private ArrayList<Card> pile1;
   private ArrayList<Card> pile2;
   private JLabel status;
   private JPanel topPanel;
   private JPanel outerPanel;
   private JLabel pic1;
   private JLabel pic2;
   //private JLabel picture;
   
   /**
      Constructor
   */
   
   public WarGUI()
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
      battleButton.addActionListener(new ButtonListener());
      panel3.add(battleButton);
      add(panel3, BorderLayout.SOUTH);
      
      JPanel panel4 = new JPanel();
      panel4.setBackground(Color.green);
      JLabel title = new JLabel("War");
      title.setFont(new Font("HELVETICA",Font.ITALIC,36));
      panel4.add(title);
      add(panel4, BorderLayout.NORTH);
      JPanel panel5 = new JPanel();
      panel5.setBackground(Color.green);
      status = new JLabel("Game in Progress");
      status.setFont(new Font("HELVETICA",Font.ITALIC,36));
      panel5.add(status);
      add(panel5, BorderLayout.NORTH);
      
      outerPanel = new JPanel(new BorderLayout());
      topPanel = new JPanel(new BorderLayout());
      topPanel.setBackground(Color.red);
      outerPanel.setBackground(Color.red);
      add(topPanel);
      add(outerPanel);
      
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
      
      // JPanel outerPanel = new JPanel(new BorderLayout());
//       JPanel topPanel = new JPanel(new BorderLayout());
//       topPanel.setBackground(Color.red);
//       outerPanel.setBackground(Color.red);
//       add(topPanel);
//       add(outerPanel);
//       setVisible(true);
//       topPanel.add(pile1.get(0).getPic(), BorderLayout.BEFORE_LINE_BEGINS);
//       topPanel.add(pile2.get(0).getPic(), BorderLayout.CENTER);
//       outerPanel.add(topPanel, BorderLayout.BEFORE_FIRST_LINE);
//       add(outerPanel);
      
         pic1 = pile1.get(0).getPic();
         pic2 = pile2.get(0).getPic();
        
   }
   
   class ButtonListener implements ActionListener
   {
      
      public void actionPerformed(ActionEvent e)
      {
         topPanel.add(pic1, BorderLayout.BEFORE_LINE_BEGINS);
         topPanel.add(pic2, BorderLayout.CENTER);
         outerPanel.add(topPanel, BorderLayout.BEFORE_FIRST_LINE);
         
         
         if (pile1.get(0).getRank() > pile2.get(0).getRank())
         {
            
            status.setText("Pile 1 wins");
            
            //JPanel panel5 = new JPanel(new BorderLayout());
            //JLabel winner = new JLabel("Pile 1 wins");
            //panel5.add(winner);
            //add(panel5, BorderLayout.CENTER);
            Card card1 = pile1.remove(0);
            Card card2 = pile2.remove(0);
            pile1.add(card1);
            pile1.add(card2);
             
            
            //pic1 = pile1.get(0).getPic();
            //pic2 = pile2.get(0).getPic();
            
                      
         }
         else if (pile1.get(0).getRank() < pile2.get(0).getRank())
         {
            status.setText("Pile 2 wins");
            //JPanel panel6 = new JPanel(new BorderLayout());
            //JLabel winner = new JLabel("Pile 2 wins");
            //panel6.add(winner);
            //add(panel6, BorderLayout.CENTER);
            //add(panel6, BorderLayout.CENTER); 
            Card card1 = pile1.remove(0);
            Card card2 = pile2.remove(0);
            pile2.add(card1);
            pile2.add(card2);  
            
            //pic1 = pile1.get(0).getPic();
            //pic2 = pile2.get(0).getPic();
                 
         }
         else if (pile1.get(0).getRank() == pile2.get(0).getRank())
         {
            status.setText("WAR!");
            //JPanel panel7 = new JPanel(new BorderLayout());
            //JLabel winner = new JLabel("WAR");
            //panel7.add(winner);
            //add(panel7);
            //add(panel7, BorderLayout.CENTER);
         }  
         
      }
   }

      
   
   
   public static void main(String[] args)
   {
      new WarGUI();
   }
      
            
      
   
}