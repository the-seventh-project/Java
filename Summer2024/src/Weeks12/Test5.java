package Weeks12;

public class Test5 extends Test4 {
	
		private int j;
		
		Test5 (){
			super(2);
			j =4;
		}
		Test5 (int i, int j) {
			super(i);
			this.j = j;
		}
		
		public void printVal() {
			System.out.println(j);
		}
		
		public void printSum() {
			System.out.println(i+j);
		}
}
