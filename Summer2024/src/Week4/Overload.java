package Week4;

public class Overload {
	
	public void test() {
		System.out.println("no para");
	}
	
	public void test(int a) {
		System.out.println("int");
	}


	public void test(int a, int b) {
		System.out.println("int a, int b");
	}

	//overloading with nearest match
	//susundin niya pa rin yung hierarchy
	public void test(double a, double b) {
		System.out.println("int a, double b");
	}
	
	//advantages of overloading 
	//first you dont need to exactly pass the exact type of parameters kasi kaya niya inconvert
	//hind mo na kailangan ibahin yung mga names
	//same name no problem, kahit differnet implementation
}
