package Week6;

public class Complex {
	private double real;
	private double imaginary;
	
	Complex (double real, double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex add(Complex c) {
		
		double c1 = this.real + c.real;
		double c2 = this.imaginary + c.imaginary;
		
		return new Complex(c1,c2);
		
	}
	
	public String toString() {
		return ("(" + real + ", " + imaginary + ")");
	}
}
