package Week6;

public class Point {
	    int x;
	    int y;

	    Point(int a, int b) {
	        x = a;
	        y = b;
	    }

	    public void tricky(Point arg1, Point arg2) {
	        arg1.x = 100;
	        arg1.y = 100;
	    }
	}
