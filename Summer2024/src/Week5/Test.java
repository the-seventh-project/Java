package Week5;

public class Test {

	int a;
	
	Test (int i) {
		a = i;
	}
	
	//Test as object type, since we are passing an object
	Test incrByTen() {
		
		//in the first sample, we use ob1 a's, incremented by 10
		Test temp = new Test(a+10);
		//passing the new object with the new value
		return temp;
	}
	
	
	
}
