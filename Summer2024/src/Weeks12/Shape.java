package Weeks12;

public abstract class Shape {
	private double one;
	private double two;
	
	Shape(double one, double two){
		this.one= one;
		this.two=two;
	}
	public abstract void area();
	
	public double getOne() {
		return one;
	}
	public void setOne(int one) {
		this.one = one;
	}
	public double getTwo() {
		return two;
	}
	public void setTwo(int two) {
		this.two = two;
	}
}
