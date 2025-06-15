package Week2;

import java.util.Scanner;

public class ArrayThings {
	public static void main (String args[]) {
		
		//declaring and initializing a double array
		int arr[][] = { {1,2,3}, {4,5,6} };
				
		//remember [row] [column], i & j are different
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(arr[i][j]);
			}
		}
				
		System.out.println("~~~~~~~~~~");		
		
		//prompt to enter four integers;
		System.out.println("Enter four integers");
		
		//declaring a double array
		int arr2 [][] = new int[2][2];
		
		//scanner object thats allows you to scan object
		Scanner scan = new Scanner(System.in);
		
		//for loop to put the scanned integers to the array
		for (int x= 0; x < 2; x++) {
			for (int y = 0; y < 2; y++) {
				arr2[x][y] = scan.nextInt();
			}
		}
		
		//for loop to print out the scanned integers in the array
		for (int x= 0; x < 2; x++) {
			for (int y = 0; y < 2; y++) {
				System.out.println(arr2[x][y]);
			}
		}
	
		
			
		
	}
	
	
}
