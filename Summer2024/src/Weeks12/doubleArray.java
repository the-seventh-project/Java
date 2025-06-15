package Weeks12;

public class doubleArray {
	public static void main (String args[]) {
		int size = 10;
		genericArray<Double> d = new genericArray<>(size);
		
		//add values randomly
		for (int i = 0; i < size; i++) {
			double randomVal = (double)((Math.random()*100)+1);
			d.set(i, randomVal);
		}
		
		//print randomly
		for (int i = 0; i < size; i++) {
			System.out.println(d.get(i));
		}
	}
}
