class CircularLinkedList{
	public class Node{
		int data;
		Node next;

		public Node(int data)
		{
			this.data=data;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void add(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public void display()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("list is empty");
		}
		else
		{
			System.out.println("Nodes of the circular linked list");
			do{
				System.out.println(current.data);
				current=current.next;
			}while(current != head);
			System.out.println();
		}
	}

	public int countNodes()
	{
		int count = 0;
		Node current = head;
		do{
			count++;
			current = current.next;
		}
		while(current!=head);
		return count;
	}

	public static void main(String [] args)
	{
		CircularLinkedList cll = new CircularLinkedList();

		cll.add(1);
		cll.add(2);
		cll.add(3);
		cll.add(4);

		cll.display();
		System.out.println("Number of nodes: " + cll.countNodes());
	}
}
