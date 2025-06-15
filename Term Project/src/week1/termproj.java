package week1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;



public class termproj extends JFrame {

	 private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JLabel ctotal, ptotal;
	    private JLabel[] playerCards, computerCards;
	    private JButton btnHit, btnStand, btnReset;    
	    private int turnCount = 0;
	    private int finalCount = 0;
	    private int playerTotal = 0;
	    private int computerTotal = 0;
	    private int finalPlayerTotal = 0;
	    private int finalComputerTotal = 0;
	    
	    //objects from the deck, and checkDuplicate
	    Deck d = new Deck();
	    checkDuplicate x = new checkDuplicate(d);	

	    public static void main(String[] args) {
	        EventQueue.invokeLater(() -> {
	            try {
	                termproj frame = new termproj();
	                frame.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });
	    }

	    public termproj() {
	        setTitle("Pirate's Plunder!");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 771, 544);

	        contentPane = new JPanel();
	        contentPane.setBackground(Color.BLACK);
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        // Title Label
	        JLabel title = new JLabel("Pirate's Plunder!");
	        title.setForeground(Color.WHITE);
	        title.setFont(new Font("Georgia", Font.PLAIN, 15));
	        title.setHorizontalAlignment(SwingConstants.CENTER);
	        title.setBounds(297, 11, 147, 14);
	        contentPane.add(title);

	        // Round Label
	        JLabel roundLabel = new JLabel("Round 1");
	        roundLabel.setForeground(Color.WHITE);
	        roundLabel.setFont(new Font("Georgia", Font.PLAIN, 15));
	        roundLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        roundLabel.setBounds(297, 31, 147, 14);
	        contentPane.add(roundLabel);

	        // Info Labels
	        ctotal = new JLabel("Computer Total:");
	        ctotal.setForeground(Color.WHITE);
	        ctotal.setFont(new Font("Georgia", Font.PLAIN, 15));
	        ctotal.setBounds(63, 56, 147, 14);
	        contentPane.add(ctotal);

	        ptotal = new JLabel("Player Total:");
	        ptotal.setForeground(Color.WHITE);
	        ptotal.setFont(new Font("Georgia", Font.PLAIN, 15));
	        ptotal.setBounds(63, 264, 147, 14);
	        contentPane.add(ptotal);

	        // Buttons
	        btnHit = new JButton("Hit!!!!");
	        btnHit.setBounds(498, 467, 89, 23);
	        btnHit.addActionListener(e -> playerHit());
	        contentPane.add(btnHit);

	        btnStand = new JButton("Stand");
	        btnStand.setBounds(594, 467, 89, 23);
	        btnStand.addActionListener(e -> playerStand());
	        contentPane.add(btnStand);

	        btnReset = new JButton("Reset");
	        btnReset.setBounds(63, 467, 89, 23);
	        btnReset.addActionListener(e -> resetGame());
	        contentPane.add(btnReset);

	        // Card Labels, where we set the images
	        playerCards = new JLabel[5];
	        computerCards = new JLabel[5];
	        
	        //two arrays of labels, 5 elements -> 5 cards per player and for computer
	        for (int i = 0; i < 5; i++) {
	        	//JLabel but in a loop
	            playerCards[i] = new JLabel();
	            playerCards[i].setIcon(new ImageIcon(termproj.class.getResource("/week1/CardsFinal/back.jpg")));
	            playerCards[i].setBounds(63 + i * 126, 275, 116, 181);
	            contentPane.add(playerCards[i]);

	            computerCards[i] = new JLabel();
	            computerCards[i].setIcon(new ImageIcon(termproj.class.getResource("/week1/CardsFinal/back.jpg")));
	            computerCards[i].setBounds(63 + i * 126, 68, 116, 181);
	            contentPane.add(computerCards[i]);
	        }
	    }
        
        
       
     //If hit
    private void playerHit() {
    	//starts with turnCount, represents the current
        if (turnCount >= 5) {
            return;
        }

        // Process computer's turn, just like blackjack, dealer/computer hits less than 26 and stands 27 up
        if (computerTotal < 26) {
            processComputerTurn();
        } else {
            setComputerCardBack();// if greater than 26 computer stands
        }

       // Process player's turn
        processPlayerTurn();

       // Finalize results
        finalizeResults();
    }
    
    //computer's turn
    private void processComputerTurn() {
    	
    	//generates a card, along with the index
        int c = x.returnACard().getIndex();
        //since 1-52 -> 1-13
        int d = ((c - 1) % 13) + 1;
        //adds to total
        computerTotal += d;
        
        //setsIcon for the label, based off the generated number
        computerCards[turnCount].setIcon(new ImageIcon(termproj.class.getResource("/week1/CardsFinal/" + c + ".jpg")));
        ctotal.setText("Computer Total: " + computerTotal); //label counter
        
    }

    //if computer stands
    private void setComputerCardBack() {
        computerCards[turnCount].setIcon(new ImageIcon(termproj.class.getResource("/week1/CardsFinal/back.jpg")));
    }

    //player's turn, same condition
    private void processPlayerTurn() {
        int a = x.returnACard().getIndex();
        int b = ((a - 1) % 13) + 1;
        playerTotal += b;
        playerCards[turnCount].setIcon(new ImageIcon(termproj.class.getResource("/week1/CardsFinal/" + a + ".jpg")));
        ptotal.setText("Player Total: " + playerTotal);
    }

    //game result message, pop-up message, disables button
    private void showGameResult(String message) {
        ptotal.setText(message);
        btnHit.setEnabled(false);
        btnStand.setEnabled(false);
        JOptionPane.showMessageDialog(null, message + " Player Total: " + playerTotal + " Computer Total: " + computerTotal);
        resetGame();
    }

    //finalize result
    private void finalizeResults() {
        turnCount++;
        finalPlayerTotal = playerTotal;
        finalComputerTotal = computerTotal;
        finalCount = turnCount;

        
        if (finalPlayerTotal > 33 || finalComputerTotal > 33) {
            showGameResult(finalPlayerTotal > 33 ? "You lose, Computer Wins!" : "You win, Computer Lose!");
        } else if (finalPlayerTotal == 33 || finalComputerTotal == 33) {
            showGameResult(finalPlayerTotal == 33 ? "You win, Computer Lose!" : "You lose, Computer Wins!");
        } else if (turnCount > 4) {
        	decideCloserTo33();
        }
        
    }

    //if player stands
    private void playerStand() {
        computerTotal = finalComputerTotal;
        turnCount = finalCount;

        // if turnCount greater than 5, computer will not get card, 
        if (turnCount < 5) {
            if (computerTotal < 26) {
                processComputerTurn();
            } else {
                setComputerCardBack();
            }

            //if player stands, finalPlayerTotal stays the same
            playerCards[turnCount].setIcon(new ImageIcon(termproj.class.getResource("/week1/CardsFinal/back.jpg")));
            ptotal.setText("Player Total: " + finalPlayerTotal);

            finalizeResults();
        }
    }


    
    //resets everything
    private void resetGame() {
        playerTotal = 0;
        computerTotal = 0;
        turnCount = 0;
        d = new Deck();
        x = new checkDuplicate(d);

        ptotal.setText("Player Total: " + playerTotal);
        ctotal.setText("Computer Total: " + computerTotal);

        // Reset card images to default 
        for (JLabel card : playerCards) {
            card.setIcon(new ImageIcon(termproj.class.getResource("/week1/CardsFinal/back.jpg")));
        }
        for (JLabel card : computerCards) {
            card.setIcon(new ImageIcon(termproj.class.getResource("/week1/CardsFinal/back.jpg")));
        }

        // Enable the hit and stand buttons
        btnHit.setEnabled(true);
        btnStand.setEnabled(true);
    }
    
    
    
    //at the end of round5 check whether Computer or Player is closer to 33
    private void decideCloserTo33() {
    	
        int diffPlayer = 33 - finalPlayerTotal;
        int diffComputer = 33 - finalComputerTotal;

        String resultMessage;
        if (diffPlayer < diffComputer) {
            resultMessage = "You win, Computer Lose!";
        } else if (diffPlayer == diffComputer) {
            resultMessage = "DRAW!";
        } else {
            resultMessage = "You lose, Computer Wins!";
        }

        JOptionPane.showMessageDialog(null, resultMessage + " Player Total: " + finalPlayerTotal + " Computer Total: " + finalComputerTotal);
        //resets the game at the end
        resetGame();
    }

    
    
     }
    






