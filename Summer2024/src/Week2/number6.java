package Week2;

public class number6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		a = (int)(Math.random()*(30) + 1990);
		
		System.out.println(a);
		
		if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0 ) {
			System.out.println("Year " + a + " is a leap year. ");
		}
		else 
			System.out.println("Year " + a + " is NOT a leap year. ");
		
	}

}
