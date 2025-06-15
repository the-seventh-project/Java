package Week2;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[] = new int [10];
			double da[] = new double[10];
		
			int sum = 0;
			
			for(int i=0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					System.out.println( "(" + i +"," + j + ")");
				}
				
				
			}
		
									
				
				for (int p : a ) {	
					if (p % 2 == 0) {
					System.out.println(p);
					sum = sum + p;
				}
					
				}
				
				System.out.println("Sumation is : " + sum);		
								
				
				
			}
			
			//for each loop
			
				
			
				
			
			
			
	}
			
			
			


