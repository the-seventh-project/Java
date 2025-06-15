package Week5;

public class MyList {

		private int items[];
		private int size;
		private int count; 
	
		
		//constructor
		public MyList(int size) {
			this.size=size;
			//allocate space for array
			items = new int[size];
			count=0;
		}
		
		public void add (int x) {
			items[count]=x;
			count++;			
		}

		void printList() {
			
			for (int i=0; i < count; i++) {
				
				System.out.print(items[i]+ "," );
			}
			
			System.out.println();

		}
		
		public int get(int position) {
			return items[position];
		}
		
		public void remove(int pos) {
			//assign the last item in the called position
			items[pos]=items[count-1];
			//getting rid of the last position
			count--;
			
		}
		
		//remove value
		int position = -1;
		public void removeByValue(int val) {
			//find the position
			for (int i = 0; i< count ; i++) {
				if (items[i] == val) {
					position = i;
				}
			}
			remove(position);
			
		}

}
