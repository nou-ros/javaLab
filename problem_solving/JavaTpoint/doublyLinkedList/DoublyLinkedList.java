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
		if(head == null)
			return;

		Node current = head, temp = null;
		while(current != null)
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

	public void deleteStart()
	{
		if(head == null)
			return;
		else{
			if(head != tail)
			{
				head = head.next;
				head.previous = null;
			}
			else{
				head = tail = null;
			}
		}
	}
	
	public void deleteMid()
	{
		if(head == null)
		{
			return;
		}
		else
		{
			Node current = head;
			int count = countNode();
			int mid = (count % 2 == 0) ? (count / 2) : ((count + 1) / 2);
			for(int i = 1; i < mid; i++)
			{
				current = current.next;
			}
			if(current == head){
				head = current.next;
			}
			else if(current == tail)
			{
				tail = tail.previous;
			}
			else{
				current.previous.next = current.next;
				current.next.previous = current.previous;
			}
			current = null;
			count--;
		}	
	}
	
	public void deleteEnd()
	{
		if(head == null)
		{
			return;
		}
		else{
		 	if(head != tail)
			{
				tail = tail.previous;
				tail.next = null;
			}
			else{
				head = tail = null;
			}
		}
	}

	public void minMax()
	{
		Node current = head;
		int min,max;
		if(head == null)
		{
			System.out.println("Empty list");
			return;
		}
		else
		{
			min = head.data;
			max = head.data;
			while(current != null)
			{
				if(min > current.data)
				{
					min = current.data;
				}
				if(current.data > max)
				{
					max = current.data;
				}
				current = current.next;
			}
			System.out.println("min is: " + min);
			System.out.println("max is: " + max);
		}
	}

	public void insertEnd(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}
		else{
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public void insertMid(int data)
	{
		int count = countNode();
		Node newNode = new Node(data);
		if(head == null)
		{
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}
		else{
			Node current = head,temp = null;
			int size = (count % 2 == 0) ? (count / 2) : ((count + 1) / 2);
			for(int i = 1; i < size; i++)
				current = current.next;
			temp = current.next;
			temp.previous = current;
			current.next = newNode;
			newNode.previous = current;
			newNode.next = temp;
			temp.previous = newNode;
		}
		count++;
	}

	public void insertBeginning(int data)
	{
		int count = countNode();
		Node newNode = new Node(data);
		if(head == null)
		{
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}
		else
		{
			newNode.next = head;
			head = newNode;
			head.previous = null;
		}
	}
	
	public void removeDuplicate()
	{
		Node current, index, temp;
		if(head == null)
			return;
		else{
			for(current = head; current != null; current = current.next)
			{

				for(index = current.next; index != null; index = index.next)
				{
					if(current.data == index.data)
					{
						temp = index;
						index.previous.next = index.next;
						if(index.next != null)
						{
							index.next.previous = index.previous;
						}
						temp = null;
					}
				}
			}
		}
	}

	public static void main(String args[])
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
		//dlist.deleteMid();
		//dlist.display();
		//dlist.deleteEnd();
		//dlist.display();
		dlist.minMax();
		dlist.insertEnd(2);
		dlist.display();
		dlist.insertBeginning(0);
		dlist.display();
		System.out.println("count" + dlist.countNode());
		dlist.removeDuplicate();
		System.out.println("Removed duplicate");
		dlist.display();
	}
}
