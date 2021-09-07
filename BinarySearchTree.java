package Proba;

class BinarySearchTree {

	class Node {
		int key;
		Node left, right;

		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}

	Node root;

	BinarySearchTree() {
		root = null; 
	}

	void deleteNode(int key) {
		root = deleteR(root, key);
	}

	Node deleteR(Node root, int key) {
		if (root == null) {
			return root;			
		}

		if (key < root.key) {
			root.left = deleteR(root.left, key);
		} else if (key > root.key) {
			root.right = deleteR(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			root.key = minValue(root.right);
			root.right = deleteR(root.right, root.key);
		}
		return root;
	}

	int minValue(Node root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

	void insert(int key) { 
		root = insertR(root, key); 
	}

	Node insertR(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key) {
			root.left = insertR(root.left, key);
		} else if (key > root.key) {
			root.right = insertR(root.right, key);
		}
		return root;
	}

	void inOrderTraversal() {
		inOrdertraversalR(root);
		}

	void inOrdertraversalR(Node root) {
		if (root != null) {
			inOrdertraversalR(root.left);
			System.out.print(root.key + " ");
			inOrdertraversalR(root.right);
		}
	}
	
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("Inorder traversal of the given tree");
		tree.inOrderTraversal();

		System.out.println("\nDelete 20");
		tree.deleteNode(20);
		System.out.println("Inorder traversal of the modified tree");
		tree.inOrderTraversal();

		System.out.println("\nDelete 30");
		tree.deleteNode(30);
		System.out.println("Inorder traversal of the modified tree");
		tree.inOrderTraversal();

		System.out.println("\nDelete 50");
		tree.deleteNode(50);
		System.out.println("Inorder traversal of the modified tree");
		tree.inOrderTraversal();
	}
}