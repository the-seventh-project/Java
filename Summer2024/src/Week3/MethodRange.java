package Week3;

import java.util.Scanner;

public class MethodRange {
	
	static int countMultiples (int number, int lowerbound, int upperbound) {

		int multiples=0;
		
		for (int i = lowerbound; i <= upperbound; i++) {
			if (i % number == 0) {
				multiples++; 
			}
		}
		return multiples;
	}
	
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number, its lowerbound and its upperbound");
		
		int num = scan.nextInt();
		int lb = scan.nextInt();
		int ub = scan.nextInt();
		
		int x = countMultiples(num, lb, ub);
		
		System.out.println("The number of Multiples of " + num + " within the range of " + lb + " and " + ub + " is " + x  );
	}
}
