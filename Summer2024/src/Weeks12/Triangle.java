package Weeks12;

public class Triangle extends Shape {

	Triangle(double one, double two){
		super(one, two);
	}

	@Override
	public void area() {
		System.out.println("Area of Triangle: " + ( (getOne() *getTwo() ) / 2) );
}
}