package queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Queue que = new Queue();
	    int n;
	    do
	    {
	        n = sc.nextInt();
	        if(n>0)
	            que.enque(n);
	    }while(n>0);
	    que.printQueue();
	    que.deque();
	    System.out.println();
	    que.printQueue();

	}

}
