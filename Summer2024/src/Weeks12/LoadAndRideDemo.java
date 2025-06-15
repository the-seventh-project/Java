package Weeks12;

public class LoadAndRideDemo {
	public static void main(String args[]) {
		ChildClass c = new ChildClass(1,2,3);
		
		//overriden
		c.math();
		
		//overload
		c.math(1, 2);
		c.math(1,2,3);
		
	}
}
