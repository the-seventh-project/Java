package Algorithms;
import java.util.Scanner;

public class LinkedList {

    // Node class
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Add method
    public void add(String data) {
        Node newNode = new Node(data); //new node for every new element

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Print method
    public void print() {
        Node current = head;
        System.out.println("\nLinked List:"); 
        while (current != null) {	//goes through the list
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.println("Enter strings to add to the linked list (type 'stop' to finish):");

        //add elements in the list
        while (true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            list.add(input);
        }
        //prints all elements present
        list.print();
    }
}
