package dayTwo.dayNine.priority;

public class Node {
	public Object value;
	public int priority = 1;
	public Node next;
	public Node previous;

	public Node(Object e) {
		this.value = e;
	}
	public Node(Object e, int priority) { 
		if (priority < 1 || priority > 10) {
			throw new IllegalArgumentException("priority must be between 1 and 10. Current value: " + priority);
		}
		this.value = e;
	}
	
	@Override
	public String toString() {
		return ""+this.value;
	}
}
