package Week4;

public class AnimalDemo {
	
	public static void main (String args[]) {
		
		Animal ani1 = new Animal ("Dog", 10,"Carnivore");
		Animal ani2 = new Animal ("Cat", 11, "Carnivore");
		Animal ani3 = new Animal ("Cow", 16, "Herbivore");
		
		
		String n = ani1.printName();
		double e = ani1.printExpectancy();
		String t = ani1.printType();
		
		String n2 = ani2.printName();
		double e2 = ani2.printExpectancy();
		String t2 = ani2.printType();
		
		String n3 = ani3.printName();
		double e3 = ani3.printExpectancy();
		String t3 = ani3.printType();
		
		if (t == "Carnivore") {
			t = "eats meat";
		}
		else 
			t = "eats grass";
		
		if (t2 == "Carnivore") {
			t2 = "eats meat";
		}
		else 
			t2 = "eats grass";
		
		if (t3 == "Carnivore") {
			t3 = "eats meat";
		}
		else 
			t3 = "eats grass";
		
		System.out.println ("A " + n + " is expected to live " + e + " years " + "and " + t + ".");
		System.out.println ("A " + n2 + " is expected to live " + e2 + " years " + "and " + t2 + "."); 
		System.out.println ("A " + n3 + " is expected to live " + e3 + " years " + "and " + t3 + "."); 
		
	}
}
