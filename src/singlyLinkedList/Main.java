package singlyLinkedList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		int data;
		Scanner sc = new Scanner(System.in);
		
		do {
			data = sc.nextInt();
			list.append(data);
		}
		while(data>0);
		list.print();

	}

}
