package queue;

public class Queue {
	Node front=null,rear=null;
	
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
    void enque(int n)
    {
        Node newnode = new Node(n);
        if(front==null)
        {
            front = rear = newnode;
        }
        else
        {
            rear.next = newnode;
            rear = newnode;
        }
    }
    
    void deque()
    {
        Node temp = front;
        front = temp.next;
        temp.next = null;
    }
    
    void printQueue()
    {
        Node temp = front;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
