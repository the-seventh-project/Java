package Week6;

public class Wrapp {
	    public static void main(String[] args) {
	        // Primitive type
	        int primitiveInt = 5;
	        
	        // Wrapping the primitive int into an Integer object
	        Integer wrappedInt = Integer.valueOf(primitiveInt);
	        
	        // Unwrapping the Integer object back to a primitive int
	        int unwrappedInt = wrappedInt.intValue();
	        
	        // Printing the values
	        System.out.println("Primitive int: " + primitiveInt);
	        System.out.println("Wrapped Integer: " + wrappedInt);
	        System.out.println("Unwrapped int: " + unwrappedInt);
	    }
	}


