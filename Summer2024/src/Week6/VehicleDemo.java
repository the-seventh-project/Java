package Week6;

public class VehicleDemo {
	public static void main (String args[]) {
		Vehicle car1 = new Vehicle(10, 70.12, "Blue");
		Vehicle car2 = new Vehicle (20, 40.49, "Yellow");
		
		System.out.println("Vehicles");
		System.out.println(car1);
		System.out.println(car2);
		
		System.out.println(" ");
		
		double i = car1.findCapacity();
		
		System.out.println(i);
		
		System.out.println(" ");
		
		//works now because of toString
		System.out.println(car1.makeNewVehicle(3));
		
		System.out.println(" ");
		
		System.out.println(Vehicle.compare(car1, car2));
		
		
		
		
		
	}
}
