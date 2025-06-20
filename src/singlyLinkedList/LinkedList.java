package singlyLinkedList;

public class LinkedList {
	
	Node head = null;
	
	class Node
	{
		Node next;
		int data;
		
		public Node(int data)
		{
	
			this.data = data;
			this.next = null;
		}
	}
	
	public void append(int data)
	{
			Node new_node = new Node(data);
			if(head == null)
			{
				head = new_node;
			}
			else
			{
				Node temp = head;
				while(temp.next!=null)
				{
					temp = temp.next;
				}
				temp.next = new_node;
			}
		
	}
	
	
	public void print()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
}
