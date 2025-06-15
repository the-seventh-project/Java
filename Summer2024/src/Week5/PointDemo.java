package Week5;

public class PointDemo {
	public static void main (String args[]) {
		
		Point p1 = new Point(3,4);
		Point p2 = new Point(10.3,-8.3);
		
		
		//passing and using parameters
		double d1 = p1.distanceFromCenter();
		double d2 = p2.distanceFromCenter();
		
		System.out.println("The distance of points " + p1 + " from the center is " + d1);
		
		System.out.println("The distance of points " + p2  + " from the center is " + d2);
		
		
		//passing and using objects
		double one = p1.distance(p2);
		System.out.println("The distance between " + p1 + " and " + p2 + " is " + one);
	
	
	
	
	
	}
}
