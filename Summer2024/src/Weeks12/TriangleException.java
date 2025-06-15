package Weeks12;

public class TriangleException {
	
	    private double side1;
	    private double side2;
	    private double side3;

	    public TriangleException(double side1, double side2, double side3) throws IllegalTriangleException {
	        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
	            throw new IllegalTriangleException("The sum of any two sides must be greater than the third side.");
	        }
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

	    public double getSide1() {
	        return side1;
	    }

	    public double getSide2() {
	        return side2;
	    }

	    public double getSide3() {
	        return side3;
	    }
	}


