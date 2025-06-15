package Week6;

public class MyList2Demo {
	public static void main (String args[]) {
		MyList2 num1 = new MyList2(5);
		
		num1.add(10);
		num1.add(11);
		num1.add(12);
		num1.add(13);
		num1.add(14);
		
		num1.printList();
		
		System.out.println();
		
		System.out.println(num1.get(3));
		
		num1.remove(1);
		
		System.out.println();
		
		num1.printList();
		
		System.out.println();
		
		num1.removeByValue(2);
		
		num1.printList();
		
		System.out.println();
		
	}
}
