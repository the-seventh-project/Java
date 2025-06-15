package Weeks12;

public class Bill {
	public static void main (String args[]) {
		CreditCardPayment cc = new CreditCardPayment();
		CashPayment cp = new CashPayment(20);
		
		cc.calcAmount();
		cp.calcAmount();
	}
}
