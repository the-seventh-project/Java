package Week8;

public class PropertyOwnershipDemo {
	public static void main(String args[]) {
		Land l1 = new Land(19.90,8.16);
		
		l1.acquire(89.0);
		System.out.println(l1.calcValue());
		System.out.println(l1);
	}
}
