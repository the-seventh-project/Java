package Week2;

//don't forget this one when using the Scanner object
import java.util.Scanner;

public class ArrayThings2 {
	public static void main (String args[]) {
		
		//initialize array
		int x[]= {1,2,3,4,5};
		
		//new way of using for loops for arrays
		int sum = 0;
		// We are using the array "x", starting from index 0. 
		// The y holds the element for each iteration
		for (int y : x) {
			sum += y;

	}
		//print out the total of the array
		System.out.println(sum);
		
		//initialize double array
		int ary [][] = new int [2][2];
		//scanner object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter four integers");
		
		//Enter four integer and store them in each index of the array
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				ary[i][j]= scan.nextInt();
			}
		}
		
		System.out.println("Elements Entered");
		
		//Print out each of the element stored in the array
		for (int q[]: ary) {
			for(int w: q) {
				System.out.println(w);
			}
		}
		
		System.out.println("     ");
		
		//print the total of the array entered, using range-based for loops
		int total = 0;
		for (int s[]: ary) {
			for (int a: s) {
				total = total + a;
			}
		}
		
		System.out.println(total);
		
}

}
