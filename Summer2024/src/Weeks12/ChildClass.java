package Weeks12;

public class ChildClass extends ParentClass{
	
	public int c;
	
	ChildClass (int a, int b, int c){
		super(a,b);
		this.c = c;
	}
	
	public void math() {
		//if you want to call the parent method through the child object
		super.math();
		System.out.println("Addition a + c, Child: " + a +c);
	}
	
	public void math(int a, int b) {
		System.out.println("Multiplication a, c: " + a*b);
	}
	
	public void math(int a, int b, int c) {
		System.out.println("Multiplication a, c: " + a*b*c);
	}
	
	
	
}
