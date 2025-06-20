package linkedList;

import java.util.Scanner;

public class InsertAtBeginning {
	Node head;
	
	public void insertAtBeginning(int data)
    {
    	Node new_node = new Node(data);
    	new_node.next = head;
    	head = new_node;
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

	public static void main(String[] args) 
	{
		InsertAtBeginning list = new InsertAtBeginning();
        Scanner sc=new Scanner(System.in);
        int data=0;
        do{
            data=sc.nextInt();
            if(data>0)
            	list.insertAtBeginning(data);
        }while(data>0);
        list.printList();
	}
}
