package Weeks10;

import java.util.Arrays;

public class PlateNumberDemo {
	public static void main (String args[]) {
		
	int size = 5;
	
	PlateNumber arr[] = new PlateNumber[size];
	
	arr[0] = new PlateNumber("QWP", 124);
	arr[1] = new PlateNumber("DSG", 532);
	arr[2] = new PlateNumber("GSD", 763);
	arr[3] = new PlateNumber("EQQ", 872);
	arr[4] = new PlateNumber("JTQ", 563);
	
	Arrays.sort(arr);
	
	for (int i = 0; i < size; i++) {
		System.out.println(arr[i]);
	}
		
	
		
		
	}
}
