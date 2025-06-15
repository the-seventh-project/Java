package copyProj;

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



public class COPYtermproj extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    int playerTotal = 0;
    int computerTotal = 0;
    Deck d = new Deck();
    noDuplicate x = new noDuplicate(d);
    JLabel ctotal;
    JLabel ptotal;
    JLabel playerCards[];
    JLabel computerCards[];
    int turnCount = 0;
    JButton btnHit;
    JButton btnStand;
    private int finalPlayerTotal = 0;
    private int finalComputerTotal = 0;
    private int finalCount = 0;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    COPYtermproj frame = new COPYtermproj();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public COPYtermproj() {
    	setBackground(new Color(240, 240, 240));

        setForeground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 771, 544);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 0));
        contentPane.setForeground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel Game = new JLabel("Pirate's Plunder!");
        Game.setForeground(new Color(255, 255, 255));
        Game.setBackground(new Color(255, 255, 255));
        Game.setFont(new Font("Georgia", Font.PLAIN, 15));
        Game.setHorizontalAlignment(SwingConstants.CENTER);
        Game.setBounds(297, 11, 147, 14);
        contentPane.add(Game);

        JLabel lblRound = new JLabel("Round 1");
        lblRound.setForeground(new Color(255, 255, 255));
        lblRound.setHorizontalAlignment(SwingConstants.CENTER);
        lblRound.setFont(new Font("Georgia", Font.PLAIN, 15));
        lblRound.setBounds(297, 31, 147, 14);
        contentPane.add(lblRound);

        btnHit = new JButton("Hit!!!!");
        btnHit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playerHit();
            }
        });
        btnHit.setBounds(498, 467, 89, 23);
        contentPane.add(btnHit);

        btnStand = new JButton("Stand");
        btnStand.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playerStand();
            }
        });
        btnStand.setBounds(594, 467, 89, 23);
        contentPane.add(btnStand);

        // Text for total and result PLAYER
        ctotal = new JLabel("Computer Total:");
        ctotal.setForeground(new Color(255, 255, 255));
        ctotal.setHorizontalAlignment(SwingConstants.LEFT);
        ctotal.setFont(new Font("Georgia", Font.PLAIN, 15));
        ctotal.setBounds(63, 56, 147, 14);
        contentPane.add(ctotal);

        // Text for total and result COMPUTER
        ptotal = new JLabel("Player Total:");
        ptotal.setForeground(new Color(255, 255, 255));
        ptotal.setHorizontalAlignment(SwingConstants.LEFT);
        ptotal.setFont(new Font("Georgia", Font.PLAIN, 15));
        ptotal.setBounds(63, 264, 147, 14);
        contentPane.add(ptotal);

        // Card Labels
        playerCards = new JLabel[5];
        computerCards = new JLabel[5];

        for (int i = 0; i < 5; i++) {
            playerCards[i] = new JLabel("");
            playerCards[i].setIcon(new ImageIcon(COPYtermproj.class.getResource("/week1/CardsFinal/back.jpg")));
            playerCards[i].setBounds(63 + i * 126, 275, 116, 181);
            contentPane.add(playerCards[i]);

            computerCards[i] = new JLabel("");
            computerCards[i].setIcon(new ImageIcon(COPYtermproj.class.getResource("/week1/CardsFinal/back.jpg")));
            computerCards[i].setBounds(63 + i * 126, 68, 116, 181);
            contentPane.add(computerCards[i]);
            
           
        }

        JButton btnNewButton_2 = new JButton("Reset");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });
        btnNewButton_2.setBounds(63, 467, 89, 23);
        contentPane.add(btnNewButton_2);

        
        
       
    }

    // If hit
    private void playerHit() {
        if (turnCount < 5) {
        	
        	//starts with computer
        	if (computerTotal < 26) {
                int c = x.returnACard().getIndex();
                int d = ((c - 1) % 13) + 1;
                computerTotal += d;

                computerCards[turnCount].setIcon(new ImageIcon(COPYtermproj.class.getResource("/week1/CardsFinal/" + c + ".jpg")));
                ctotal.setText("Computer Total: " + computerTotal);
            }
        	else 
        		computerCards[turnCount].setIcon(new ImageIcon(COPYtermproj.class.getResource("/week1/CardsFinal/back"  + ".jpg")));

            // Check if the computer went over the limit
        	if (computerTotal > 33) {
                ptotal.setText("You Win AHOYYY!");
                btnHit.setEnabled(false);
                btnStand.setEnabled(false);
            } 
                
                //start ng player
            int a = x.returnACard().getIndex();
            int b = ((a - 1) % 13) + 1;
            playerTotal += b;

            // Update player's card and total
            playerCards[turnCount].setIcon(new ImageIcon(COPYtermproj.class.getResource("/week1/CardsFinal/" + a + ".jpg")));
            ptotal.setText("Player Total: " + playerTotal);

            if (playerTotal > 33) {
                ptotal.setText("You Lost ARGHHH!");
                btnHit.setEnabled(false);
                btnStand.setEnabled(false);
            } 

            
                
                }
            
            turnCount++;
            
            finalPlayerTotal = playerTotal;
            finalComputerTotal = computerTotal;
            
            if(finalPlayerTotal > 33) {
        		JOptionPane.showMessageDialog(null, "You lose, Computer Wins! Player Total: " + finalPlayerTotal + " Computer Total: " + finalComputerTotal );
        		resetGame();
        	}
        	
        	else if (finalComputerTotal > 33) {
        		JOptionPane.showMessageDialog(null, "You win, Computer Lose! Player Total: " + finalPlayerTotal + " Computer Total: " + finalComputerTotal );
        		resetGame();
        	}
            
        	else if (turnCount > 4) {	
        		finalDecision();
        	}
        	
        	else if(finalPlayerTotal == 33 || finalComputerTotal == 33) {
        		if (finalPlayerTotal == 33) {
        			JOptionPane.showMessageDialog(null, "You win, Computer Lose! Player Total: " + finalPlayerTotal + " Computer Total: " + finalComputerTotal );
        			resetGame();
        		}
        		else {
        			JOptionPane.showMessageDialog(null, "You lose, Computer Wins! Player Total: " + finalPlayerTotal + " Computer Total: " + finalComputerTotal );
        			resetGame(); 
        		}
        	}
            
            finalCount = turnCount;
            }
        
    // If stand
    private void playerStand() {
    	
    	
    	
    	computerTotal = finalComputerTotal;
        turnCount = finalCount;
        
        
    	
    	if (turnCount < 5) {      
        
        if (computerTotal < 26) {
        	 int e = x.returnACard().getIndex();
             int d = ((e - 1) % 13) + 1;
             computerTotal += d;
        computerCards[turnCount].setIcon(new ImageIcon(COPYtermproj.class.getResource("/week1/CardsFinal/" + e + ".jpg")));
        ctotal.setText("Computer Total: " + computerTotal + turnCount);
        
        
        }
        else {
        	computerCards[turnCount].setIcon(new ImageIcon(COPYtermproj.class.getResource("/week1/CardsFinal/back"   + ".jpg")));
        }
        
        if (computerTotal > 33) {
            ptotal.setText("You Win AHOYYY!");
            btnHit.setEnabled(false);
            btnStand.setEnabled(false);
        } 
        
        
    	    playerTotal = finalPlayerTotal;
    	    int c = playerTotal;
    	    playerCards[turnCount].setIcon(new ImageIcon(COPYtermproj.class.getResource("/week1/CardsFinal/back" + ".jpg")));
            ptotal.setText("Player Total: " + playerTotal);
           
            
    	} 
    	
    	 finalPlayerTotal = playerTotal;
         finalComputerTotal = computerTotal;
         finalCount++;
         
         if(finalPlayerTotal > 33) {
     		JOptionPane.showMessageDialog(null, "You lose, Computer Wins! Player Total: " + finalPlayerTotal + " Computer Total: " + finalComputerTotal );
     		resetGame();
     	}
     	
     	else if (finalComputerTotal > 33) {
     		JOptionPane.showMessageDialog(null, "You win, Computer Lose! Player Total: " + finalPlayerTotal + " Computer Total: " + finalComputerTotal );
     		resetGame();
     	}
         
     	else if (finalCount > 4) {	
     		finalDecision();
     	}
     	
     	else if(finalPlayerTotal == 33 || finalComputerTotal == 33) {
     		if (finalPlayerTotal == 33) {
     			JOptionPane.showMessageDialog(null, "You win, Computer Lose! Player Total: " + finalPlayerTotal + " Computer Total: " + finalComputerTotal );
     			resetGame();
     		}
     		else {
     			JOptionPane.showMessageDialog(null, "You lose, Computer Wins! Player Total: " + finalPlayerTotal + " Computer Total: " + finalComputerTotal );
     			resetGame();
     		}
     	}
         
    	   
    	   
    	    
    	
    	    
    	}

    

    private void resetGame() {
        playerTotal = 0;
        computerTotal = 0;
        turnCount = 0;
        d = new Deck();
        x = new noDuplicate(d);

        ptotal.setText("Player Total: " + playerTotal);
        ctotal.setText("Computer Total: " + computerTotal);

        // Reset card images to default (assuming "null.jpg" is the default image)
        for (JLabel card : playerCards) {
            card.setIcon(new ImageIcon(COPYtermproj.class.getResource("/week1/CardsFinal/back.jpg")));
        }
        for (JLabel card : computerCards) {
            card.setIcon(new ImageIcon(COPYtermproj.class.getResource("/week1/CardsFinal/back.jpg")));
        }

        // Enable the hit and stand buttons
        btnHit.setEnabled(true);
        btnStand.setEnabled(true);
    }
    
    private void finalDecision() {
    	
    	
    	//incase both less than 33
    	turnCount = finalCount;
    	
    	
    	int diff1 = 33-finalPlayerTotal;
    	int diff2 = 33-finalComputerTotal;
    	
    	if (diff1 < diff2) {
    		JOptionPane.showMessageDialog(null, "You win, Computer Lose! Player Total: " + finalPlayerTotal + " Computer Total: " + finalComputerTotal );   
    		resetGame();
  }
    	else if (diff1 == diff2) {
    		JOptionPane.showMessageDialog(null, "DRAW!");
    		resetGame();
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "You lose, Computer Wins! Player Total: " + finalPlayerTotal + " Computer Total: " + finalComputerTotal );
    		resetGame();
    	}
    	}
     }
    






