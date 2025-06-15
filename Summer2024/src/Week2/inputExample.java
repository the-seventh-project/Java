package Week2;


import java.util.Scanner;

public class inputExample {

	public static void main(String args[]) {
		
		// TODO Auto-generated method stub
				
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Please Enter your name ");
		
		String s1 = input.nextLine();
		
		System.out.println("Hello " + s1 );
		
		System.out.print("Enter an integer: ");
		
		int n = input.nextInt();
		
		System.out.println("The square of the entered integer is: " + (n*n)); 
		
		
		
		
			
		
	}

}