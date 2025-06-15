package Week7;

public class Book {
	private String title;
	private String author;
	private double price;
	
	public Book() {
		title = "null";
		author = "null";
		price = 0.0;
	}
	
	//parameterized constructor
	public Book(String title, String author, double price) {
	
		this.title = title;
		this.author = author;
		this.price = price;
	}

	
	//toString
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	//setter and getter methods
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
