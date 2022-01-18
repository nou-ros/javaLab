import java.util.LinkedList;
import java.util.Queue;


public class DiffOddEvenLevel{
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

	public DiffOddEvenLevel(){
		root = null;
	}
	
	public int difference(){
		int oddLevel = 0, evenLevel = 0, difference = 0;
		// to keep tracks of number of nodes in each level
		int nodesInLevel = 0;
		// to keep track of level in binary tree
		int currentLevel = 0;
		//to keep track of levelWise nodes in tree
		Queue<Node> queue = new LinkedList<Node>();

		if(root == null){
			System.out.println("Tree is empty");
			return 0;
		}else{
			queue.add(root);
			currentLevel++;
			while(queue.size() != 0){
				nodesInLevel = queue.size();
				while(nodesInLevel > 0){
					Node current = queue.remove();
					if(currentLevel % 2 == 0)
						evenLevel += current.data;
					else
						oddLevel += current.data;
					// add left child to queue
					if(current.left != null)
						queue.add(current.left);
					if(current.right != null)
						queue.add(current.right);
					nodesInLevel--;
				}
				currentLevel++;
			}
			difference = Math.abs(oddLevel - evenLevel);
		}
		return difference;
	}
	
	public static void main(String args[]){
		DiffOddEvenLevel binTree = new DiffOddEvenLevel();
		binTree.root = new Node(1);
		binTree.root.left = new Node(2);
		binTree.root.right = new Node(3);
		binTree.root.left.left = new Node(4);
		binTree.root.right.left = new Node(5);
		binTree.root.right.right = new Node(6);

		System.out.println("difference between sum of odd level and even level: " + binTree.difference());
	}
}
