package Week5;

public class Player {
	private String name;
	private String position;
	private int rating;
	
	Player(String name, String pos, int rating){
		this.name = name;
		this.position = pos;
		this.rating = rating;
	}
	
	public String toString() {
		return name + " plays at " + position 
				+ " & has " + rating + " points";
	}


	public int getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}
}