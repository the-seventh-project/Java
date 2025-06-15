package Week5;

public class DriverDemo {

	public static void main(String[] args) {
		MyList l1 = new MyList(5);
		l1.add(67);
		l1.add(45);
		l1.printList();
		
		l1.add(-8);
		l1.printList();
		
		System.out.println(l1.get(2));
		
		l1.printList();
		
		l1.remove(1);
		l1.printList();
		l1.add(9);
		l1.printList();
		
		l1.removeByValue(-8);
		l1.printList();

	}

}
