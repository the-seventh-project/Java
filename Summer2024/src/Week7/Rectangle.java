package Week7;

public class Rectangle extends Shape{
	
	private double side1;
	private double side2;
	
	public Rectangle(String name, double side1, double side2) {
		super(name);
		this.side1 = side1;
		this.side2 = side2;
	}
	
	
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public double area() {
		double Area = side1 * side2;
		return Area;
	}
	
	public double perimeter() {
		double Perimeter = 2 * (side1 + side2);
		return Perimeter;
	}
	
}
