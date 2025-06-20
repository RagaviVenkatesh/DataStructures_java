package postfix;

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
    void push(int n)
    {
        Node newnode = new Node(n);
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
    
    int pop()
    {
        Node temp = head;
        head = temp.next;
        return temp.data;
    }
}
