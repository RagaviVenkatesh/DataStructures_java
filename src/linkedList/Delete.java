package linkedList;

import java.util.Scanner;

public class Delete {
	Node head;
	public void append(int data)
    {
        Node new_node = new Node(data);
        if (head == null)
        {
            head = new_node;
            return;
        }
        Node temp = head; 
        while (temp.next != null)
            temp = temp.next;
        temp.next = new_node;
        return;
    }
	
    public void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }

        head = head.next;  // Move head to the next node
    }
    
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }

        if (head.next == null) {
            head = null;  // Only one node
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;  // Traverse to second-last node
        }

        temp.next = null;  // Remove reference to last node
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (position == 0) {
            head = head.next;  // Delete the head
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        temp.next = temp.next.next;  // Skip over the node at the given position
    }

    
    public static void main(String[] args) 
	{
    	Delete list = new Delete();
        Scanner sc=new Scanner(System.in);
        int data=0;
        do{
            data=sc.nextInt();
            if(data>0)
        	    list.append(data);
        }while(data>0);
        int choice = 0;
        do
        {
        	System.out.println("1. Delete at beginning");
        	System.out.println("1. Delete at end");
        	System.out.println("1. Delete at a given position");
        	choice = sc.nextInt();
        }while(choice>0);
        list.deleteAtBeginning();
        list.printList();
	}
}
