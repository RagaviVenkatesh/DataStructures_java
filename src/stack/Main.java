package stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Stack stack = new Stack();
	    int data;
	    do
	    {
	        data = sc.nextInt();
	        if(data>0)
	            stack.push(data);
	    }while(data>0);
	    stack.printStack();
	    stack.pop();
	    System.out.println();
	    stack.printStack();

	}

}
