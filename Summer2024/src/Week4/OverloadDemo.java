package Week4;

public class OverloadDemo {
	public static void main (String args[]) {
	Overload cu = new Overload();
	
	cu.test();
	cu.test(1);
	cu.test(1,3);
	cu.test(1);
	
	cu.test(2.0,1);
	}
}
