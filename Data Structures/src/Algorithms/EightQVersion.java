package Algorithms;

public class EightQVersion {
	
		//Main
		public static void main (String[] args) {
			
			//Creates Board
		    int[][] board = new int[8][8]; 
		    
		    //Generates first row
		    int first = (int)(Math.random() * 8);
		    board[first][0] = 1; 
		    
		    //Starts with column 1
		    solve(board, 1);
		    
		    //Board with Eight Queens
		    printBoard(board);
		    
		}
		
		//Recursion Method
		public static boolean solve(int[][] board, int col) {
			
			if (col == 8) { //Base Case
				return true;
			}
			
			for (int row = 0; row < board.length; row++) {
				//Checks specific (row, col) if its safe
				if(check(board, row, col)) {
					//If (row, col) is valid
					board[row][col] = 1;
						//Recursion method, checks if next column has available row
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

		
		
		//Shows the Final Board
		public static void printBoard(int[][] board) {
			
			for(int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					//Prints columns of every row
					System.out.print(board[i][j] + " ");
				}
				//After each row -> next line
				System.out.println();
			}
		
		}

	
}
