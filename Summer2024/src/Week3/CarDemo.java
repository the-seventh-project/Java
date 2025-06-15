package Week3;

public class CarDemo {
	public static void main (String args[]) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.color = "Blue";
		car1.engineCapacity = 10.1;
		car1.make = "BMW";
		
		car2.color = "Red";
		car2.engineCapacity = 11.9;
		car2.make = "Honda";
		
		double total = car1.engineCapacity + car2.engineCapacity;
		
		System.out.println("The engine capacity of both cars is " + total);
		
	}
}
