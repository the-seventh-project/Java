package Weeks12;

public class Rectangle extends Shape{
	
	Rectangle(double one, double two){
		super(one, two);
	}

	@Override
	public void area() {
		System.out.println("Area of a Rectangle: " + (getOne() * getTwo()) );
	}

}
