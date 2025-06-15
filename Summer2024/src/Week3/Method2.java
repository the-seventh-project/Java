package Week3;

import java.util.Scanner;


public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter an integer");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if (checkEven(num)) {
			System.out.println("Even");
		}
		else 
			System.out.println("Odd");
	}

	static boolean checkEven(int x) {
		if (x % 2 == 0) {
			return true;
		}
		else 
			return false;
	}
}
