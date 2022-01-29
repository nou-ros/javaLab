public class LeafLevel{
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
	public static int level = 0;
	public LeafLevel(){
		root = null;
	}

	public boolean isSameLevel(Node temp, int currentLevel){
		if(root == null){
			System.out.println("Tree is empty");
			return true;
		}else{
			if(temp == null)
				return true;
			if(temp.left == null && temp.right == null){
				if(level == 0){
					level = currentLevel;
					return true;
				}
				// checks whether other leaves are at the same level of first leaf
				else
					return (level == currentLevel);
			}
			return(isSameLevel(temp.left, currentLevel + 1) && isSameLevel(temp.right, currentLevel + 1));
		}
	}

	public static void main(String args[]){
		LeafLevel bt = new LeafLevel();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.right.left = new Node(5);
		bt.root.right.right = new Node(6);
		bt.root.right.left.left = new Node(7);
		
		if(bt.isSameLevel(bt.root, 1))
			System.out.println("All leaves are at same level");
		else
			System.out.println("All leaves are not at same level");
	}

}
