package stack;

public class Stack {
	Node head=null;
    class Node
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data = data;
            this.next=null;
        }
    }
    
    void push(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode;
        }
        else
        {
            newnode.next = head;
 head = newnode;
        }
    }
    
    void pop()
    {
        Node temp = head;
        head = temp.next;
    }
    
    void printStack()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
}


//infix - a+b -  2 + 3 / 5 * 6
//prefix - +ab - + 2 3 / 5 * 6
//postfix - ab+ 6 4 1 / 3 + *


