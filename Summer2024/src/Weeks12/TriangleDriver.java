package Weeks12;

public class TriangleDriver {
	    public static void main(String[] args) {
	        try {
	            TriangleException triangle1 = new TriangleException(3, 4, 5);
	            System.out.println("Triangle with sides 3, 4, 5 created successfully.");
	        } catch (IllegalTriangleException e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            TriangleException triangle2 = new TriangleException(1, 2, 3);
	            System.out.println("Triangle with sides 1, 2, 3 created successfully.");
	        } catch (IllegalTriangleException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


