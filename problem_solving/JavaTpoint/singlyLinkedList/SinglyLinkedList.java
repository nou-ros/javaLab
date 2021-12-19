class LinkedList{
	class Node
	{
		int data;
		Node next;

		 Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;
	Node tail = null;

	void addNode(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}

	void display()
	{
		Node current = head;
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes are: ");
		while(current!=null)
		{
			System.out.println(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}

	int countNodes(){
		int count=0;
		Node current = head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}

	void recursive_reverse(Node current)
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		else
		{
			if(current.next==null)
			{
				System.out.println(current.data+" ");
				return;
			}	
			recursive_reverse(current.next);
			System.out.println(current.data+" ");
		}
	}
	
	Node iterative_reverse(Node current)
	{			
		if(head==null)
		{
			System.out.println("List is empty");
			return null;
		}
		else{
			Node prev = null;
			Node next = null;
			while(current!=null)
			{
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			return prev;
		}
	}

	void delete_start_node()
	{
		if(head==null)
		{
			System.out.println("Empty list");
			return;
		}
		else{
			if(head!=tail)
			{
				System.out.println("deleted node: " + head.data);
				head=head.next;
			}
			else{
				System.out.println("deleted node: " + head.data);
				head = tail = null;
			}
		}
	}

	void delete_middle_node()
	{		
		int count = this.countNodes();

		if(head==null)
		{
			System.out.println("Empty list");
			return;
		}
		else
		{
			int size = (count%2==0)?(count/2):((count+1)/2);
			System.out.println("Size of the list:"+ size);
			Node temp, current;
			if(head!=tail)
			{
				temp=head;
				current=null;
				for(int i=0;i<size-1;i++)
				{
					current=temp;
					temp=temp.next;
				}
				if(current!=null)
				{
					System.out.print("Current: "+current.data);
					current.next=temp.next;
					System.out.println("deleted item: "+temp.data);
					temp=null;
				}
				else 
				{
					head=tail=temp.next;
					System.out.println("deleted: "+temp.data);
					temp=null;	
				}
			}
			else
			{
				head=tail=null;
			}
		}
		
		count--;
	}

	void min_max_node()
	{
		Node current = head;
		int min, max;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			min = head.data;
			max = head.data;
			while(current!=null)
			{
				if(min>current.data)
				{
					min=current.data;
				}
				if(max<current.data)
				{
					max=current.data;
				}
				current=current.next;
			}
			
			System.out.println("Minimum node value: "+min);
			System.out.println("Maximum node value: "+max);	
		}
	}

	void search_node(int value)
	{
		Node current=head;
		int i=0;
		if(head==null)
		{
			System.out.println("List is empty");
		}	
		else
		{
			while(current!=null)
			{
				if(value==current.data)
				{
					System.out.println("found in position: "+i);
					break;
				}
				i++;
				current=current.next;
			}
		}
	}

	void removeDuplicate()
	{
		Node current = head;
		Node index = null,temp = null;	
		if(head==null)
		{
			System.out.println("List is empty");
		}	
		else
		{
			while(current!=null)
			{
				temp = current;
				index = current.next;
				while(index!=null)
				{
					if(current.data==index.data)
					{
						temp.next = index.next;
					}
					else{
						temp=index;
					}
					index=index.next;
				}
				current=current.next;
			}
		}
	}

	void add_node_at_start(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
		}	
		else
		{
			Node temp = head;
			head = newNode;	
			head.next = temp;
		}
	}

	void add_node_at_end(int data)
	{
			
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
		}	
		else
		{
			tail.next = newNode;	
			tail = newNode;
		}
	}

	void add_node_at_mid(int data)
	{
		int count = this.countNodes();
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
		}	
		else
		{
			Node temp,current;
			int size = (count%2==0)?(count/2):((count+1)/2);
			temp = head;	
			current = null;
			for(int i=0;i<size;i++)
			{
				current = temp;
				temp = temp.next;
			}
			current.next = newNode;
			newNode.next = temp;
		}
		count++;
	}

	void isPalindrome_list()
	{
		Node current = head;
		boolean flag = true; 
		int count = this.countNodes();
		int mid = (count%2==0)?(count/2):((count+1)/2);

		for(int i=1;i<mid;i++)
		{
			current=current.next;
		}
		Node revHead = iterative_reverse(current.next);
		while(head!=null&&revHead!=null)
		{
			if(head.data!=revHead.data)
			{
				flag=false;
				break;
			}
			head = head.next;
			revHead = revHead.next;
		}
		if(flag)
			System.out.println("Given singly linked list is a palindrome");
		else
			System.out.println("Single Linked list is not palindrome");
	}
}
	
public class SinglyLinkedList{
	public static void main(String[] args)
	{
		LinkedList s_list = new LinkedList();

		s_list.addNode(1);
		s_list.addNode(3);
		s_list.addNode(5);
		s_list.addNode(5);
		s_list.addNode(3);
		s_list.addNode(1);

		s_list.display();
		System.out.println("Total number of nodes: " + s_list.countNodes());

		//System.out.println("Reversed recursive list: ");
		//s_list.recursive_reverse(s_list.head);

		//System.out.println("Reversed iterative list: ");
		//s_list.iterative_reverse(s_list.head);
		//s_list.display();

		//s_list.delete_start_node();
		//s_list.display();
		
		//s_list.delete_middle_node();
		//s_list.display();
		
		//s_list.min_max_node();	
		//s_list.search_node(2);
		//
		//s_list.removeDuplicate();
		//s_list.display();
		//
		//s_list.add_node_at_start(9);
		//s_list.display();
		//
		//s_list.add_node_at_end(6);
		//s_list.display();
		//
		//s_list.add_node_at_mid(0);
		//s_list.display();
		//
		s_list.isPalindrome_list();
	}
}
