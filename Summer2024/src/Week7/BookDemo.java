package Week7;

public class BookDemo {
	public static void main(String args[]) {
	
		EBook b1 = new EBook("Harry Potter", "JKA", 120.50, "www.harry.com", 500);
		PaperBook b2 = new PaperBook("Tarzan", "EKB", 100.09, 45, true);
		
		System.out.println(b1);
		
		System.out.println(b2);
		
		System.out.println("Total Price: " + b2.totalPrice(3.5));
		
		
	}
}
