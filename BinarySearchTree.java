package ArrayList;

class Node {
	public int key;
//	String name;
	
	public Node leftChild;
	public Node rightChild;
	
	Node (int key) {
		this.key = key;
//		this.name = name;
	}
}

public class BinarySearchTree {
	
	public void preOrderTravesal(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.key + " ");
		preOrderTravesal(root.leftChild);
		preOrderTravesal(root.rightChild);
	}
	
	public void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.leftChild);
		System.out.print(root.key + " ");
		inOrderTraversal(root.rightChild);
	}
	
	public void postOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		postOrderTraversal(root.leftChild);
		postOrderTraversal(root.rightChild);
		System.out.print(root.key + " ");
	}
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.leftChild = new Node(6);
		root.rightChild = new Node(21);
		root.leftChild.leftChild = new Node(1);
		root.leftChild.rightChild = new Node(8);
		root.rightChild.leftChild = new Node(13);
		root.rightChild.rightChild = new Node(25);
		root.rightChild.leftChild.leftChild = new Node(12);
		root.rightChild.leftChild.rightChild = new Node(18);
		
		BinarySearchTree treeBinary = new BinarySearchTree();
		
		treeBinary.preOrderTravesal(root);
		System.out.println();
		
		treeBinary.postOrderTraversal(root);
		System.out.println();
		
		treeBinary.inOrderTraversal(root);
		System.out.println();
	}
	
}