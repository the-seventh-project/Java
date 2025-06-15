package Week6;

public class ComplexDemo {
	public static void main (String args[]) {
		Complex a = new Complex(4.9,8.78);
		Complex b = new Complex(4.4,231.1);
	
			
		Complex result = a.add(b);
		
		System.out.println(result);
	}
}
