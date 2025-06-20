package linkedList;

import java.util.Scanner;

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
class LinkedList
		{
		    Node head;
		    public void append(int data)
		    {
		        Node new_node = new Node(data);
		        if (head == null)
		        {
		            head = new Node(data);
		            return;
		        }
		        Node temp = head; 
		        while (temp.next != null)
		            temp = temp.next;
		        temp.next = new_node;
		        return;
		    }
		    
		    
		    
//		    public void insertAtBeginning(int data)
//		    {
//		    	Node new_node = new Node(data);
//		    	new_node.next = head;
//		    	head = new_node;
//		    }
//		    
		    public void printList()
		    {
		        Node temp = head;
		        while (temp != null)
		        {
		            System.out.print(temp.data+" ");
		            temp = temp.next;
		        }
		    }
		    
		}
		public class Main
		{
			public static void main(String[] args) 
			{
				LinkedList list = new LinkedList();
		        Scanner sc=new Scanner(System.in);
		        int data=0;
		        do{
		            data=sc.nextInt();
		            if(data>0)
		        	    list.append(data);
		        }while(data>0);
		        list.printList();
			}
		}
