package Week6;

public class MyList2 {

		private int items[];
		private int size;
		
		//mistake review on declaring an array
		MyList2(int size) {
			items = new int[size];
			this.size = size;
			
		}
		
		int count = 0;
		public void add(int x) {
			//adding the integer into the array
			items[count] = x;
			count++;
		}
		
		public int get (int position) {
			//kung ano yung value sa position na yun, yun yung kukuhanin
			int value = items[position];
			return value;
		}
		
		public void remove (int position) {
			//mistake forgot the count-1
			items[position] = items[count-1];
			//mistake forgot na mababawasan;
			count--;
			
		}
		
		public void printList() {
			for (int i = 0; i < count; i++) {
				System.out.println(items[i]);
			}
		}
		
		public void removeByValue(int value) {
			for (int j = 0; j < count; j++) {
				if (j == value) {
					items[j] = items[count-1];
					count--;
				}
			}
		}
		
}
