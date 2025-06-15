package Weeks12;

public class TestDemo1 {
	public static void main (String args[]) {
		Test4 t4 = new Test4 (9);
		Test5 t51 = new Test5();
		Test5 t5 = new Test5 (9,18);
		
		//should print value 9
		t4.printVal();
		
		//no constructor, here print value 4
		t51.printVal();
		//no constructor, here print value 2+4, since you add a super(2)
		t51.printSum();
		
		//print value 9
		t5.printVal();
		//print value 9+18
		t5.printSum();
		
		
	}
}
