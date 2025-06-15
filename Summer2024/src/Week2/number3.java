package Week2;

import java.util.Scanner;

public class number3 {
	public static void main(String args[]) {
		
		int number;
				
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		
		int a = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			number = a * i;
			System.out.println(a + " x " + i + " = " + (number));
		}
		
					
		
	}
	
		

}
