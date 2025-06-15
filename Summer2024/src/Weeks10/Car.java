package Weeks10;

public class Car {
	
	private String plateNumber;
	private boolean serviced;
	
	Car (String p) {
		this.plateNumber=p;
		this.serviced = false;
	}

	public boolean isServiced() {
		return serviced;
	}

	public void setServiced(boolean serviced) {
		this.serviced = serviced;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String toString () {
		return ("Car: " + plateNumber);
	}
	
}
