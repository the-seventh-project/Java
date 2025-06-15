package Week6;
	
public class PointDemo {
	    public static void main(String[] args) {
	        Point pnt1 = new Point(0, 0);
	        Point pnt2 = new Point(0, 0);

	        System.out.println("X:" + pnt1.x + " Y:" + pnt1.y);
	        System.out.println("X:" + pnt2.x + " Y:" + pnt2.y);

	        pnt2.tricky(pnt1, pnt2);

	        System.out.println("X:" + pnt1.x + " Y:" + pnt1.y);
	        System.out.println("X:" + pnt2.x + " Y:" + pnt2.y);
}
}
