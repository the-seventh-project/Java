package Week7;

public class PaperBook extends Book{
	double shippingWeight;
	boolean inStock;
	
	
	public PaperBook(String title, String author, double price, double sw, boolean n) {
		super(title, author, price);
		this.inStock=n;
		this.shippingWeight=sw;
		// TODO Auto-generated constructor stub
	}

	//try to use inStock 
	public double totalPrice(double charge) {
		
		double totalPrice = 0.0;
		if(inStock) {
		totalPrice = getPrice() + shippingWeight * charge;
		}
		
		return totalPrice;
	}

	@Override
	public String toString() {
		return "PaperBook [shippingWeight=" + shippingWeight + ", inStock=" + inStock + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
