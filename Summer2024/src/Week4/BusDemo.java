package Week4;

public class BusDemo {
	public static void main (String args[]) {
		
		Bus no_of_seats = new Bus(5);
	
		int no = no_of_seats.number();
		int nonew = no_of_seats.increaseCapacity();
		int nonew2 = no_of_seats.increaseCapacity(17);
		
		System.out.println("The current number of Seats is: " + no);
		System.out.println("The new number of Seats is " + nonew);
		System.out.println("The new number of Seats is (parameter) " + nonew2);
		
		
	}
}
