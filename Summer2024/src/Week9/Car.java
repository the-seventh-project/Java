package Week9;

public class Car extends Vehicle{
	
	private double engineCapacity;
	
	Car (double w, int s, double e) {
	super(w,s);
	this.engineCapacity = e;
	}
	
	public void calcSpeed() {
		System.out.println("Car");
	}
}
