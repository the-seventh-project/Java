package Week3;

import java.util.Scanner;

public class PrimeMethod {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		
		int num = scan.nextInt();
		
		isPrime(num);
	}
	
	static void isPrime(int x) {
		boolean isPrime= true;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				System.out.println("Not Prime");
				isPrime = false;
				break;
			}
		}
		
		if (isPrime == true) {
			System.out.println("Prime");
		}
	
	}

}
