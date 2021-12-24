public class DoublyLinkedList{
	
	class Node{
		int data;
		Node previous;
		Node next;
		public Node(int data)
		{
			this.data = data;
		}
	}

	Node head,tail = null;
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}else{
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public void display()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		while(current != null)
		{
			System.out.println(current.data+" ");
			current = current.next;
		}
	}

	public int countNode()
	{
		Node currentNode = head;
		int count = 0;
		while(currentNode != null)
		{
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}
	
	public void iterReverse()
	{
		if(head==null)
			return;

		Node current=head,temp=null;
		while(current!=null)
		{
			temp = current.next;
			current.next = current.previous;
			current.previous = temp;
			current = current.previous;
		}
		temp = head;
		head = tail;
		tail = temp;
	}

	public static void main(String[] args)
	{
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.addNode(1);
		dlist.addNode(3);
		dlist.addNode(2);
		dlist.addNode(5);
		dlist.addNode(4);

		dlist.display();
		System.out.println("Total nodes: " + dlist.countNode());

		dlist.iterReverse();
		System.out.println("Reverse iterative: ");
		dlist.display();
	}
}
