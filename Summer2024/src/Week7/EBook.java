package Week7;

public class EBook extends Book {
	 String url;
	 double sizeMB;
	 
	public EBook(String title, String author, double price, String url, double sizeMB) {
		super(title, author, price);
		this.url = url;
		this.sizeMB = sizeMB;
	}

	
	public String toString() {
		return "EBook [url=" + url + ", sizeMB=" + sizeMB + ", toString()=" + super.toString() + "]";
	}
	 
	
	 
}
