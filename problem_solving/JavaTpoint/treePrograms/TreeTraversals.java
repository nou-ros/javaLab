public class TreeTraversals{
	
	static class Node{
		int data;
		Node left, right;

		public Node(int data)
		{
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	TreeTraversals(){ root = null; }

	void printPostorder(Node node)
	{
		if(node == null)
			return;

		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.data + " ");
	}

	void printInorder(Node node)
	{
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}

	void printPreorder(Node node)
	{
		if(node == null)
			return;
		System.out.print(node.data + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}


	void printPostorder(){ printPostorder(root); }
	void printInorder(){ printInorder(root); }
	void printPreorder(){ printPreorder(root); }

	public static void main(String args[])
	{
		TreeTraversals tree = new TreeTraversals();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Preorder traversal: ");
		tree.printPreorder();
		System.out.println("\nInorder traversal: ");
		tree.printInorder();
		System.out.println("\nPostorder traversal: ");
		tree.printPostorder();
		System.out.println();
	}
}
