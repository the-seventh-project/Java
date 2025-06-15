package Week6;

public class Library {
	private Book books[];
	
	Library (int size) {
		books = new Book[size];
	}

	int count = 0;
	public void addBook(Book b) {
		books[count] = b;
		count++;
	}
	
	//put that particular value of the index 
	public void removeBook(String name) {
		for (int i = 0; i < count; i++) {
			
			if(books[i].getTitle().equals(name)) {
				books[i]=books[count-1];
				count--;
			}
		}
		
	}
	
	public void ListBook() {
		for(int i = 0; i <count; i++) {
			System.out.println(books[i].getTitle());
		}
	}
}
