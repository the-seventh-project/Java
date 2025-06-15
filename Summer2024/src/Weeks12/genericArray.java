package Weeks12;

public class genericArray<T>{
	private T[] arr;
	
	public genericArray(int size) {
		arr = (T[]) new Object[size];
	}
	
	public void set (int index, T value) {
		arr[index] = value;
	}
	
	public T get(int index) {
		return arr[index];
	}
}
