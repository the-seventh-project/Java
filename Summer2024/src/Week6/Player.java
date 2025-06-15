package Week6;

public class Player {
	
	private String name;
	private String position;
	private int rating;
	
	public Player(String name, String position, int rating) {
		this.name = name;
		this.position = position;
		this.rating = rating;
	}
	
	public String toString() {
		return ("(" + name + ", " + position + ", " + rating + ") " );
	}
	
	public String getName() {
		return name;
	}
	
	public int getRating() {
		return rating;
	}
}
