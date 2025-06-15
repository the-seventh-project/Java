package Weeks10;

public class RunnABLE implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running!!!");
		
	}
	
}
