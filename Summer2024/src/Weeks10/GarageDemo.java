package Weeks10;

public class GarageDemo {
	public static void main(String args[]) {
		
		//making Linked list
		Garage g = new Garage();
		
		//adding to the list
		g.addCar(new Car("OPQ 141"));
		g.addCar(new Car("FAA 415"));
		g.addCar(new Car("VSD 135"));
		g.addCar(new Car("BSH 865"));
		g.addCar(new Car("HSF 245"));
		
		//display
		g.printCars();
		
		//car service
		Car carService = g.findCar("OPQ 141");
			carService.setServiced(true);
			
		//removing 
		g.removeCar("VSD 135");
		g.removeCar("FAA 415");
		
		System.out.println(" ");
		
		g.printCars();
		
		System.out.println(" ");
		
		//finding car based off plate number
		System.out.println(g.findCar("OPQ 141"));
		
		System.out.println(" ");
		
		g.addCar(new Car("DWP 515"));
		g.addCar(new Car("QFV 141"));
		g.addCar(new Car("BSS 125"));
		
		g.printCars();
		
		
	}
}
