package Week5;

public class Point {
	
	//two fields, x and y
	private double x;
	private double y;
	
	//constructor with no parameters
	Point() {
		x=0;
		y=0;
	}
	
	//constructor with parameter
	Point (double x, double y){
		this.x = x;
		setY(y);
		//also means this.y=y , we are just using the setter method
	}
	
	//accessors
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	//mutators
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	//to find the distance from the center
	public double distanceFromCenter() {
		double d = 0;
		d = Math.sqrt(x*x + y*y);
		return d;
	}
	
	//to show return the points given with the object
	public String toString() {
		return ("( " + x + ", " + y + " )");
	}
	
	//checks distance between points
	//Mistake, should be p.x, because WE ARE USING THE x and y of the passed object, so we need to reference it to the object to be used
	public double distance(Point p) {
		double px = (this.x - p.x) * (this.x - p.x);
		double py = (this.y - p.y) * (this.y - p.y);
		double dist = Math.sqrt(px+py);
		return dist;
	}

	
}
