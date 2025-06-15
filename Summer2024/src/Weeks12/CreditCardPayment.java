package Weeks12;

public class CreditCardPayment implements Payment{

	private double amount;
	
	CreditCardPayment(){
		this.amount = Sale.amount;
	}
	@Override
	public void calcAmount() {
		// TODO Auto-generated method stub
		//amount minus discounted amount
		System.out.println(amount);
		
	}

	public void authorize() {
		System.out.println("Authorized");
	}
	
}
