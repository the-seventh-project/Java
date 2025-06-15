package Week1;

import java.util.Scanner;

public class SystemIn {

	public static void main(String[] args) {
		
		int a, b, total;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		
		a = scan.nextInt();
		
		System.out.println("Enter the second number");
		
		b = scan.nextInt();
		
		total = a + b;
		
		System.out.println("The result is " + total);
		
		

	}

}


