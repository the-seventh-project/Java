package Week6;

public class LibraryDemo {
	public static void main(String args[]) {
		
		Author a1 = new Author("Val", "Boy");
		Author a2 = new Author("Drake", "Boy");
		
		Book b1 = new Book("Not Like Us", "123", a1);
		Book b2 = new Book("Meet the Grahms", "143", a1);
		Book b3 = new Book("Family Matters", "190", a2);
		
		Library l1 = new Library(5);
		
		l1.addBook(b3);
		l1.addBook(b2);
		l1.addBook(b1);
		
		l1.ListBook();
		
		
		
		System.out.println(" ");
		
		l1.removeBook("Family Matters");
		
		
		l1.ListBook();
		
		
		
	
		
	}
}
