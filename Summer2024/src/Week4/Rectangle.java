package Week4;

public class Rectangle {

	public double length;
	public double width;
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	
	public double calculateArea() {
		return length*width;
	}

}
