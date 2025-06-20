package linkedList;

import java.util.Scanner;

public class Reverse {
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
    
    public void reverseList() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;     // store next node
            current.next = prev;     // reverse the pointer
            prev = current;          // move prev forward
            current = next;          // move current forward
        }

        head = prev;  // reset head to new front
    }

    
    public static void main(String[] args) 
	{
    	Reverse list = new Reverse();
        Scanner sc=new Scanner(System.in);
        int data=0;
        do{
            data=sc.nextInt();
            if(data>0)
        	    list.append(data);
        }while(data>0);
        list.reverseList();
        list.printList();
	}
}
