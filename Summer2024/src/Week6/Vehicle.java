package Week6;

public class Vehicle {
	
		private int passengers;
		private double maxSpeed;
		private String color;
		
		Vehicle (int passengers, double maxSpeed, String color) {
			this.passengers = passengers;
			this.maxSpeed = maxSpeed;
			this.color = color;
		
		}
		
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		//750/whatever
		double Capacity = 0;
		public double findCapacity() {
			Capacity = (passengers * 75) / (0.20 * maxSpeed);
			return Capacity;
		}
		
		
		public Vehicle makeNewVehicle (int factor) {
			int newPassengers = passengers * factor;
			double newMaxSpeed = maxSpeed * factor;
			String newColor =  color;
			return new Vehicle (newPassengers, newMaxSpeed, newColor);
		}
		
		
		public static Vehicle compare(Vehicle v1, Vehicle v2) {
			if (v1.Capacity > v2.Capacity) {
				return v1;
			}
			else 
				return v2;
		}
		
		public String toString() {
			return ("(" + passengers + ", " + maxSpeed + ", " + color + " )");
		}

		

}
