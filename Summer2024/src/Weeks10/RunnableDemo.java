package Weeks10;

public class RunnableDemo {
	
	//https://www.geeksforgeeks.org/runnable-interface-in-java/
	public static void main (String args[]) {
		System.out.println("Main thread: " + Thread.currentThread().getName());
		
		Thread t1 = new Thread(new RunnABLE());
		t1.start();
	}
}
