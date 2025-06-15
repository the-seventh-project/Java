package Week6;

public class AnimalDemo {
	public static void main (String args[]) {
		
		Animal sp1 = new Animal(3, "Dog");
		Animal sp2 = new Animal (2,"Dragon");

		
		sp1.eat();
		sp2.eat();
		
		Mammal m1 = new Mammal();
		m1.move();
	
	}
}
