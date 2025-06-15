package Week5;

public class RetOb {
	public static void main (String args[]) {
		Test ob1 = new Test(2);
		Test ob2;
		
		//assigning object 1 a's to object 2 but with the method
		ob2 = ob1.incrByTen();
		
		System.out.println("ob1.a value:" + ob1.a);
		System.out.println("ob2.a value:" + ob2.a);
		
		ob2 = ob2.incrByTen();
		
		System.out.println("ob1.a value:" + ob2.a);
		
		Test1 ob3 = new Test1(10,20);
		System.out.println(ob3.a);
		System.out.println(ob3.b);
		
		ob3.incrByTen(ob3);
		
		System.out.println(ob3.a);
		System.out.println(ob3.b);
		
		
		
	}
}
