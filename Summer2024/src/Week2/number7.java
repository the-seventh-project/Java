package Week2;

import java.util.Scanner;

public class number7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[] = new double[5];
	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 double value numbers");
	
		for (int i = 0; i < 5; i++) {
	
			a[i] = input.nextDouble();
			
			}
		
		System.out.println("These are the values you've entered ");
		for (double p : a) {
			System.out.println(p);
				}
		
		double max = 0;
		for (int j = 0; j < 5; j++) {
				if (a[j] > max)
				max = a[j];
		}
		
		System.out.println("The maximum number in the array is " + max);
		
	}
}
