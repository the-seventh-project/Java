package Algorithms;

public class EightQueens {
	
	  public static void main(String[] args) {
		  int[][] board = new int[8][8];

		    int firstRow = (int)(Math.random() * 8);
		    board[firstRow][0] = 1;

		    solve(board, 1);  // solve from column 1 onward
	    }

	    // Solves the board using backtracking
	    public static boolean solve(int[][] grid, int col) {
	    	
	    	
	        if (col == 8) {
	            printBoard(grid);
	            return true; // found a valid solution
	        }

	        for (int row = 0; row < 8; row++) {
	            if (isSafe(grid, row, col)) {
	                grid[row][col] = 1; // place queen

	                if (solve(grid, col + 1)) {
	                    return true; // move to next column
	                }

	                grid[row][col] = 0; // backtrack
	            }
	        }

	        return false; // no valid position in this column
	    }

	    // Checks if a queen can be safely placed at (row, col)
	    public static boolean isSafe(int[][] grid, int row, int col) {
	        // Check left side of row
	        for (int j = 0; j < col; j++) {
	            if (grid[row][j] == 1) return false;
	        }

	        // Check upper left diagonal ↖
	        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
	            if (grid[i][j] == 1) return false;
	        }

	        // Check lower left diagonal ↙
	        for (int i = row, j = col; i < 8 && j >= 0; i++, j--) {
	            if (grid[i][j] == 1) return false;
	        }

	        return true;
	    }

	    // Prints the board
	    public static void printBoard(int[][] grid) {
	        for (int[] row : grid) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	        System.out.println(); // extra space after printing
	    }
	
	

}


