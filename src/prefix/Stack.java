package prefix;

public class Stack {
	Node head=null;
    class Node
    {
        double data;
        Node next;
        
        Node(double data)
        {
            this.data = data;
            this.next=null;
        }
    }
    void push(double n)
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
    
    double pop()
    {
        Node temp = head;
        head = temp.next;
        return temp.data;
    }
    
}
