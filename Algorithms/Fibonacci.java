package Algorithms;
import java.util.Scanner;

public class Fibonacci {
	public static void main (String[] args) {
		
		//Asks the users for input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a nonnegative integer: ");
		
		//Scan the users input
		int n = scan.nextInt();
		//Prints the answer
		System.out.println("The fibonacci of " + n + " is " + fibonacci(n));
	}

		//Recursion Method for Fibonacci
		static int fibonacci(int n) {
			//base case
			if (n <= 2) {
				return  1;
			}
			//sum of the two previous number
			else {
				return fibonacci(n-1) + fibonacci(n-2);
			}
		}
	
}
