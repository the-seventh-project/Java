package Weeks10;

public class Garage {
	private Node head;
	
	Garage() {
		this.head=null;
	}
	
	//https://www.geeksforgeeks.org/
	//implementing-a-linked-list-in-java-using-class/
	public void addCar(Car car) {
		Node new_Node = new Node(car);
		
		if(head == null) {
			head = new_Node;
		}
		
		else {
		
		Node last = head;
		
		while(last.next != null) {
			last = last.next;
		}
		
		last.next=new_Node;
	}
}
	
	//https://www.geeksforgeeks.org/
	//implementing-a-linked-list-in-java-using-class/
	public Garage removeCar(String plateNumber) {
	
		Node currentNode = head, prev = null;
		
		//head
		if (currentNode != null && currentNode.car.getPlateNumber().equals(plateNumber)) {
			head = currentNode.next;
			return this;
		}
		
		//other than the head
		while (currentNode != null && !currentNode.car.getPlateNumber().equals(plateNumber)) {
			prev = currentNode;
			currentNode = currentNode.next;
			
		}
		
		//plateNumber into currentNode
		if (currentNode != null) {
			prev.next = currentNode.next;
		}
			else {
				System.out.println("not found");
			}
				
		
		return this;
	}
	
	public Car findCar (String plateNumber) {
		Node current = head;
		while (current != null) {
			if(current.car.getPlateNumber().equals(plateNumber)) {
				return current.car;
				
			}
			
			current = current.next;
					
		}
	
	return null;
}
	
	public void printCars() {
		Node current = head;
		while (current!= null) {
			System.out.println(current.car);
			current = current.next;
		}
	}
}
