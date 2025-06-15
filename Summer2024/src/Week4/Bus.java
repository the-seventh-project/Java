package Week4;

public class Bus {
	
	public int no_of_seats;
	
	public Bus (int no_of_seats) {
		this.no_of_seats=no_of_seats;
	}
	
	public int get_no_of_seats() {
		return no_of_seats;
	}
	
	public void set_no_of_seats(int no_of_seats) {
		this.no_of_seats=no_of_seats;
	}
	
	
	public int increaseCapacity() {
		return no_of_seats + 5;
	}
	
	public int increaseCapacity(int newSeats) {
		return  no_of_seats + newSeats;		
	}
	
	public int number() {
		return no_of_seats;
	}
}
