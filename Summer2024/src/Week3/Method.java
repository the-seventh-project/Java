package Week3;

public class Method {

	public static void main(String[] args) {
		
		checkEven(2);

	}
	
	static void checkEven(int x) {
		if ( x % 2 == 0) {
			System.out.println("Even");
		}
		else
			System.out.println("Odd");
	}

}
