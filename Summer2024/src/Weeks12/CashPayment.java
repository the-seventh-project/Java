package Weeks12;

public class CashPayment implements Payment {
	private double amountTendered;
	private double changeGiven;
	
	CashPayment(int a){
		amountTendered = a;
	}
	@Override
	public void calcAmount() {
		// TODO Auto-generated method stub
		System.out.println("Total Amount: " + amount + " Amount Tendered: " + amountTendered + " Change given: "  + (amountTendered-amount));
		
	}
	
	 
}
