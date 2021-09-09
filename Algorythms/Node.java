package Algorythms;

public class Node {
		
	public Integer  value;
	public Node next;
	public Node previous;
	
	public Node(int value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public Node getPrevious() {
		return this.previous;
	}
	
}
