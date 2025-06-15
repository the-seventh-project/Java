package Week3;

public class MethodRange2 {

	static int countMultiples ( int number, int lower, int upper) {
		
		int i = lower;
		int count = 0;		
		
		while (i <= upper) {
			if ( i %  number == 0) {
				count++;
			}
			i++;
		}
		
		return count;
	}
	
	public static void main (String[] args) {
		
		int x = countMultiples(2,1,10);
		
		System.out.println("The number of multiples is: " + x);
	}
	
	







}
