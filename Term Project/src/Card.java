
public class Card {
	
	//basically 1-10, Jack - 11, Queen - 12, King -13
	//for the suits 
	//club -1, diamonds - 2, heart -3, spade -4
	private int value;
	private String suit;
	
	Card (int value, String suit) {
		this.value = value;
		this.suit =suit;
		}

	public Card(int[] value2, String[] suit2) {
		// TODO Auto-generated constructor stub
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String toString() {
		return (value + " of " + suit);
	}
}
