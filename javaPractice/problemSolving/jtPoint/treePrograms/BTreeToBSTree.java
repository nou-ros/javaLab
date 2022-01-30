import java.util.Arrays;


public class BTreeToBSTree{

	public static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public Node root;
	int treeArray[];
	int index = 0;

	public BTreeToBSTree(){
		root = null;
	}
	
	public int calculateSize(Node node){
		int size = 0;
		if(node == null)
			return 0;
		else{
			size = calculateSize(node.left) + calculateSize(node.right) + 1;
			return size;
		}
	}
	
	public void convertBTtoArray(Node node){
		if(root == null){
			System.out.println("Tree is empty");
			return;
		}else{
			if(node.left != null)
				convertBTtoArray(node.left);
			treeArray[index] = node.data;
			index ++;
			if(node.right != null)
				convertBTtoArray(node.right);
		}
	}

	public Node createBSTree(int start, int end){
		if(start > end){
			return null;
		}
		//variable will store middle element of array and make it root of binary search tree
		int mid = (start + end)/2;
		Node node = new Node(treeArray[mid]);
		
		// construct left subtree
		node.left = createBSTree(start, mid - 1);
		node.right = createBSTree(mid + 1, end);

		return node;
	}

	public Node convertBTBST(Node node){
		int treeSize = calculateSize(node);
		treeArray = new int[treeSize];
		
		convertBTtoArray(node);

		Arrays.sort(treeArray);

		Node d = createBSTree(0, treeArray.length - 1);
		return d;
	}

	public void inorderTraversal(Node node){
		if(root == null){
			System.out.println("Tree is empty");
			return;
		}else{
			if(node.left != null)
				inorderTraversal(node.left);
			System.out.print(node.data + " ");
			if(node.right != null)
				inorderTraversal(node.right);
		}
	}
	
	public static void main(String args[]){
		BTreeToBSTree bt = new BTreeToBSTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);

		System.out.println("Inorder representationL of binary tree: ");
		bt.inorderTraversal(bt.root);

		Node bst = bt.convertBTBST(bt.root);
		System.out.println("Inorder representation of binary search tree: ");
		bt.inorderTraversal(bst);
	}	
}
