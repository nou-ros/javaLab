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

	public void recursiveReverse(Node current)
	{
		if(current.next==head)
		{
			System.out.print(current.data);
			return;
		}
		recursiveReverse(current.next);
		System.out.print(" "+current.data);
	}

	public Node iterativeReverse(Node current)
	{
		if(head==null)
			return null;
		Node prev = null;
		Node next = null;
		do{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}while(current != head);

		head = prev;
		tail = current;
		tail.next = head;
		return head;
	}

	public void deleteStart()
	{
		if(head==null)
			return;
		else
		{
			if(head!=tail)
			{
				head=head.next;
				tail.next=head;
			}
			else
			{
				head=tail=null;
			}
		}
	}

	public void deleteEnd()
	{
		if(head == null)
			return;
		else
		{
			if(head != tail)
			{
				Node current = head;
				while(current.next != tail)
				{
					current = current.next;
				}
				tail = current;
				tail.next = head;
			}
			else
			{
				head=tail=null;
			}
		}

	}
	
	public void deleteMid()
	{
		Node current, temp;	
		int count = countNodes();
		if(head == null)
		{
			return;
		}
		else
		{
			count = (count%2==0)?(count/2):((count+1)/2);
			if(head != tail)
			{
				temp = head;
				current = null;

				for(int i=0;i<count-1;i++)
				{
					current = temp;
					temp = temp.next;
				}
				if(current != null)
				{
					current.next = temp.next;
					temp = null;
				}
				else
				{
					head = tail = temp.next;
					tail.next = head;
					temp = null;
				}
			}
			else
			{
				head=tail=null;
			}
		}
		count--;
	}

	public void min_max()
	{
		Node current = head;
		int min = head.data;
		int max = head.data;

		if(head==null)
			System.out.println("List is empty");
		else
		{
			do{
				if(min>current.data)
				{
					min=current.data;
				}
				if(max<current.data)
				{
					max=current.data;
				}
				current = current.next;
			}while(current!=head);
		
			System.out.println("Min value: "+ min +" max value: " +max);
		}
	}
	
	public void insertStart(int data)
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
			Node temp = head;
			newNode.next = temp;
			head = newNode;
			tail.next = head;
		}
	}
	
	public void insertEnd(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
			tail.next = head;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public void insertMiddle(int data)
	{
		int count = countNodes();
		count = (count%2==0)?(count/2):((count+1)/2);
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}
		else
		{
			Node temp,current;
			temp = head;
			current = null;
			for(int i=0;i<count;i++)
			{
				current = temp;
				temp = temp.next;
			}
			current.next = newNode;
			newNode.next = temp;
		}
		count++;
	}

	public void removeDuplicate()
	{
		Node current = head,index = null,temp = null;

		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			do{
				temp = current;
				index = current.next;
				while(index != head)
				{
					if(current.data==index.data)
					{
						temp.next = index.next;
					}
					else
					{
						temp = index;
					}
					index = index.next;
				}
				current = current.next;
			}while(current.next!=head);
		}
	}

	public void search(int element)
	{
		Node current = head;
		int i = 1;
		boolean flag = false;
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			do{
				if(current.data == element)
				{
					flag = true;
					break;
				}
				current = current.next;
				i++;
			}while(current!=head);

			if(flag)
			{
				System.out.println("Element present at: "+i);
			}
			else
			{
				System.out.println("Element not present");
			}
		}
	}

	public void sortList()
	{
		Node current=head,index=null;
		int temp;
		
		if(head==null)
		{
			System.out.println("list is empty");
		}
		
		else
		{
			do {

				index = current.next;
				while(index!=head)
				{
					if(current.data>index.data)
					{											temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}while(current.next != head);
		}
	}

	public static void main(String [] args)
	{
		CircularLinkedList cll = new CircularLinkedList();

		cll.add(1);
		cll.add(3);
		cll.add(4);
		cll.add(2);

		cll.display();
		System.out.println("Number of nodes: " + cll.countNodes());
		//System.out.println("Recursive reverse: ");
		//cll.recursiveReverse(cll.head);
		System.out.println();
		//System.out.println("Itertive reverse: ");
		cll.iterativeReverse(cll.head);
		cll.display();
		
		System.out.println("Delete first Node: ");	
		//cll.deleteStart();
		//cll.display();
		//cll.deleteEnd();
		//cll.display();
		//cll.deleteMid();
		//cll.display();
		
		cll.min_max();

		System.out.println("Add new Node: ");
		//cll.insertStart(7);
		//cll.insertEnd(5);
		cll.insertMiddle(2);
		cll.display();

		//cll.removeDuplicate();
		//cll.display();
		//cll.search(3);
		cll.sortList();
		cll.display();

	}
}
