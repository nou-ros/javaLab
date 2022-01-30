public class BinarySearchTree{
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

	public BinarySearchTree(){
		root = null;
	}

	public void insert(int data){
		Node newNode = new Node(data);
		if(root == null){
			root = newNode;
			return;
		}else{
			Node current = root, parent = null;
			while(true){
				parent = current;
				if(data < current.data){
					current = current.left;
					if(current == null){
						parent.left = newNode;
						return;
					}
				}else{
					current = current.right;
					if(current == null){
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public Node minNode(Node root){
		if(root.left != null)
			return minNode(root.left);
		else
			return root;
	}
	
	// left, root, right
	public void inorderTraversal(Node node){
		if(root == null){
			System.out.println("Tree is empty");
			return;
		}else{
			if(node.left != null)
				inorderTraversal(node.left);
			System.out.println(node.data + " ");
			if(node.right != null)
				inorderTraversal(node.right);
		}
	}
	
	public Node deleteNode(Node node, int value){
		if(node == null){
			return null;
		}else{
			//value is less than node's data then, search the value in left subtree
			if(value < node.data){
				node.left = deleteNode(node.left, value);
			}
			// value is greater than node's data then, search the value in left subtree
			else if(value > node.data){
				node.right = deleteNode(node.right, value);
			}
			//if value is equal to node's data is, we have found the node to be deleted
			else{
				//if node to be deleted has no child then, set the node to null
				if(node.left == null && node.right == null){
					node = null;
				}
				// if node to be deleted has only one right child
				else if(node.left == null){
					node = node.right;
				}
				//if node to be deleted has onle on left child
				else if(node.right == null){
					node = node.left;
				}
				// if node to be deleted has two children node
				else{
					// then find the minimum node from the right subtree
					Node temp = minNode(node.right);
					// exchange the data between node and temp
					node.data = temp.data;
					// delete the duplicate node from right subtree
					node.right = deleteNode(node.right, temp.data);
				}
			}
			return node;
		}
	}

	public static void main(String args[]){
		BinarySearchTree bt = new BinarySearchTree();

		bt.insert(50);
		bt.insert(30);
		bt.insert(70);
		bt.insert(60);
		bt.insert(10);
		bt.insert(90);

		System.out.println("Binary search tree after insertion: ");
		bt.inorderTraversal(bt.root);

		Node deletedNode = null;
		deletedNode = bt.deleteNode(bt.root, 50);
		System.out.println("Binary search tree after deletion of 50");
		bt.inorderTraversal(bt.root);
	}
}
