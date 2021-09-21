package dayTwo.dayEight;

public class DNode {
	
	
	public Integer  value;
	public DNode next;
	public DNode previous;
	
	public DNode(int value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public DNode getNext() {
		return next;
	}
	
	public DNode getPrevious() {
		return this.previous;
	}
	
}
