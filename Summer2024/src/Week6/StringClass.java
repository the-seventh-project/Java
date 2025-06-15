package Week6;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name1 = "Val;Rosario";
		String name2 = "Carlos;Mina";
		
		int i = name1.indexOf(";");
		String lastname1 = name1.substring(i+1);
		
		System.out.println(lastname1);
		
		int j = name2.indexOf(";");
		String lastname2 = name2.substring(j+1);
		
		System.out.println(lastname2);
		
		
	}

}
