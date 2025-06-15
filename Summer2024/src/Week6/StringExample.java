package Week6;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "testing new String example" ;
		
		//will find the length of the string including the space 
		System.out.println(s1.length());
		
		//REMEMBER starts with 0, finds the character at that specific number
		System.out.println(s1.charAt(9));
		
		//finds the position of the first occurrence of the letter
		System.out.println(s1.indexOf("w"));
		
		//finds out if there is an occurrence of that particular string, if yes, return true
		System.out.println(s1.contains("exam"));
		
		//prints whatever the start of the substring until the end of the string;
		System.out.println(s1.substring(11));
		//The difference is that it states the minimum and the maximum
		System.out.println(s1.substring(11, 15));
		
		//compares strings with each other based off the ASCII code
		System.out.println("Cat".compareTo("Box"));
		System.out.println("Apple".compareTo("Can"));
		System.out.println("Apple".compareTo("Apple"));
		
		
		String name = "Adam Smith";
		//will find the position of space and then take a substring from that position
		
		System.out.println(name.substring(name.indexOf(" ")));
		
		String name2 = "Ray Ban";
		int i = name2.indexOf(" ");
		i = i + 1;
		System.out.println(name2.substring(i));
		
		System.out.println(s1.endsWith("w"));
	}

}
