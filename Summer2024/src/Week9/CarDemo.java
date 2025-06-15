package Week9;

public class CarDemo {
	public static void main(String args[]) {
	Car c1 = new Car(10.1,11, 13.2);
	c1.calcSpeed();
	
	Vehicle v = c1;
	v.calcSpeed();
	
}
}
