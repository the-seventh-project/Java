package Algorithms;
import java.util.Scanner;

public class RecusrionChar {
	public static void main (String[] args) {
		
		//asks user for input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a nonnegative integer: ");
		//scans the input
		int n = scan.nextInt();
		//displays result of the factorial
		System.out.println("The facotorial of " + n + " is " + factorial(n));
		
	}

	//Function that solved factorial
static int factorial(int n) {
	if (n == 0) { //Base Case -> Condition
		return 1; // -> if it is last value 
	}
	else {
		return n * factorial(n-1); //Recursive Call-> 
	}
	
	
}


}

