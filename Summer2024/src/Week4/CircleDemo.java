package Week4;

public class CircleDemo {

	public static void main(String[] args) {
		
		
		Circle c1 = new Circle(4.0);
		Circle c2 = new Circle(5.0);
		
		double c1Perimeter = c1.calculatePerimeter();
		double c1Area = c1.calculateArea();
		
		double c2Perimeter = c2.calculatePerimeter();
		double c2Area = c2.calculateArea();
		
		
		System.out.println("Circle One");
		System.out.println("Circle One Perimeter: " + c1Perimeter );
		System.out.println("Circle One Area " + c1Area);
		
		System.out.println(" ");
		
		System.out.println("Circle Two");
		System.out.println("Circle Two Perimeter: " + c2Perimeter);
		System.out.println("Circle Two Area: " + c2Area);
		
	}

}
