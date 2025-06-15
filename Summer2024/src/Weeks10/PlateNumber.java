package Weeks10;

public class PlateNumber implements Comparable<PlateNumber> {
	private String letter;
	private int number;
	
	public PlateNumber (String letter, int number) {
		this.letter = letter;
		this.number = number;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	//https://www.geeksforgeeks.org/
	//comparable-interface-in-java-with-examples/
	public int compareTo(PlateNumber other) {
		if(this.letter.compareTo(other.letter) != 0) {
			return this.letter.compareTo(other.letter);
			
		}
		
		else {
			return this.number - other.number;
		}
	}

	public String toString() {
		return (letter + " " + number);
	}

}
