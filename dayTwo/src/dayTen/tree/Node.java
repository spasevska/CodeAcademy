package dayTen.tree;

public class Node {
	
	public int priority;
	public Object value;
	public Node leftChild;
	public Node rightChild;
	
	public Node(Object value, int priority) {
		this.priority = priority;
		this.value = value;
	}
	
}
