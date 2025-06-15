package Weeks12;

public class Circle extends Shape{

	Circle(double one, double two){
		super(one, two);
	}

	@Override
	public void area() {
		System.out.println("Area of a Circle: " + (Math.PI*getOne()*getOne()));
	}
}
