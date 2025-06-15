package Week6;

public class Animal {
	
		private int age;
		private String name;
		
		Animal (int age, String n) {
			this.age = age;
			name = n;
		}
		
		Animal () {
			age = 0;
			name = "undefined";
		}

		public void eat() {
			System.out.println(name + " is eating. ");
		}
}
