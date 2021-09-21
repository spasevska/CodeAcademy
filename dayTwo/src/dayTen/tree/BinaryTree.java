package dayTen.tree;

public class BinaryTree {
	
	private Node rootNode = null;
	public int size;
	
	public BinaryTree add(Object value, int priority) {
		Node newNode = new Node(value, priority);
		if (rootNode == null) {
			rootNode = newNode;
		} else {
			Node pointer = rootNode;
			while (true) {
				if (pointer.priority == newNode.priority) {
					throw new IllegalArgumentException("priority  already exists");
				} else if (pointer.priority > newNode.priority) {
					if (pointer.leftChild == null) {
						pointer.leftChild = new Node(value, priority);
					} else {
						pointer = pointer.leftChild;
					}
				} else {
					if (pointer.rightChild == null) {
						pointer.rightChild = newNode;
					} else {
						pointer = pointer.rightChild;
					}
					pointer = pointer.rightChild;
				}			
			}
		}
		size++;
		return this;
	}
	
}
