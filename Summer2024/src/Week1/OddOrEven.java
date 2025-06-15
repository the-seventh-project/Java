package Week1;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		
		System.out.println("Enter a number");
		
		Scanner scan = new Scanner(System.in);
		
		number = scan.nextInt();

		if (number % 2 == 0) {
			System.out.println("Even");
		}
		else 
			System.out.println("Odd");
		
}
	
}
