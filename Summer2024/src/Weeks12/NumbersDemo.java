package Weeks12;

public class NumbersDemo {
	public static void main(String args[]) {
		One t1 = new One();
		Two t2 = new Two();
		Three t3 = new Three();
		
		t1 = t2;
		t1.showme();
		t1 = t3;
		t1.showme();
		t2 = t3;
		t2.showme();
		
	}
}
