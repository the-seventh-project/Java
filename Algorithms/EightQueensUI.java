package Algorithms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EightQueensUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int[][] board = new int[8][8];
	private JPanel[][] cells = new JPanel[8][8];


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EightQueensUI frame = new EightQueensUI();
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
	public EightQueensUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 600, 650); 
	    setResizable(false);

	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setLayout(new BorderLayout(10, 10));
	    setContentPane(contentPane);

	    // Chess Board Grid & Background
	    JPanel gridPanel = new JPanel(new GridLayout(8, 8, 2, 2));

	    for (int row = 0; row < 8; row++) {
	        for (int col = 0; col < 8; col++) {
	            JPanel cell = new JPanel();
	            cell.setLayout(new BorderLayout());

	            // Icy Sea Theme: light blue and deep sea blue
	            if ((row + col) % 2 == 0) {
	                cell.setBackground(new Color(189, 224, 235)); 
	            } else {
	                cell.setBackground(new Color(77, 112, 148));   
	            }
	            
	            cell.setBorder(null);

	            gridPanel.add(cell);
	            cells[row][col] = cell;
	        }
	    }

	    contentPane.add(gridPanel, BorderLayout.CENTER);

	    // Start button
	    JButton startButton = new JButton("Start");
	    startButton.addActionListener(e -> {
	        // Clear board and UI
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                board[i][j] = 0;
	                cells[i][j].removeAll();
	                cells[i][j].revalidate();
	                cells[i][j].repaint();
	            }
	        }

	        // Generate first queen randomly
	        int first = (int)(Math.random() * 8);
	        board[first][0] = 1;

	        // Solve and display
	        solve(board, 1);
	        showQueens();
	    });

	    contentPane.add(startButton, BorderLayout.SOUTH);
	}
	
	
	//Recursion Method
	public static boolean solve(int[][] board, int col) {
		
		if (col == 8) { //Base Case
			return true;
		}
		
		for (int row = 0; row < board.length; row++) {
			//Checks specific (row, col) if its safe
			if(check(board, row, col)) {
				board[row][col] = 1;
					//Recursion Part, checks if next column has available row
					//If not backtrack and place different one
					if (solve(board, col + 1)) return true;
		            board[row][col] = 0; // 
				}
			}
		
		return false;
	
	}
	
	//Check Diagonals and Rows
	public static boolean check(int[][] board, int row, int col) {

	    // Check row on the left
	    for (int j = 0; j < col; j++) {
	        if (board[row][j] == 1) return false;
	    }

	    // Check upper-left diagonal
	    for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
	        if (board[i][j] == 1) return false;
	    }

	    // Check lower-left diagonal
	    for (int i = row, j = col; i < 8 && j >= 0; i++, j--) {
	        if (board[i][j] == 1) return false;
	    }

	    return true;
	}

	
	//UI for Eight Queens
	private void showQueens() {
		//Queen PNG
	    ImageIcon originalIcon = new ImageIcon(getClass().getResource("Queen1.png"));
	    //Resize Queen.Png to fir
	    java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(77, 77, java.awt.Image.SCALE_SMOOTH);
	    ImageIcon queenIcon = new ImageIcon(scaledImage);

	    //Adds Queen.Png per Row and Column
	    for (int row = 0; row < 8; row++) {
	        for (int col = 0; col < 8; col++) {
	            if (board[row][col] == 1) {
	                JLabel queenLabel = new JLabel(queenIcon);
	                cells[row][col].add(queenLabel);
	            }
	        }
	    }

	    contentPane.revalidate();
	    contentPane.repaint();
	}


}
