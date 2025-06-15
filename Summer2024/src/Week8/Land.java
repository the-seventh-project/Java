package Week8;

public class Land implements PropertyOwnerhsip{
	private double landArea;
	private double unitPrice;
	
	public Land( double landArea, double unitPrice) {
		this.landArea = landArea;
		this.unitPrice = unitPrice;
	}
	
	public String toString() {
		return ("Land Area and Unit Price");
	}
	
	public void acquire(double property) {
		System.out.println(property);
	}
	
	public double calcValue() {
		double total = landArea * unitPrice;
		return total;
	}
}
