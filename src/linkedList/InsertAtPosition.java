package linkedList;

import java.util.Scanner;

public class InsertAtPosition {
    Node head;

    public void append(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = new_node;
    }

    public void insertAtPosition(int data, int position) {
        Node new_node = new Node(data);
        if (position == 0) {
            new_node.next = head;
            head = new_node;
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        new_node.next = temp.next;
        temp.next = new_node;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	InsertAtPosition list = new InsertAtPosition();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements to append (end with non-positive number):");
        int data;
        do {
            data = sc.nextInt();
            if (data > 0)
                list.append(data);
        } while (data > 0);

        System.out.println("Linked List:");
        list.printList();

        System.out.println("Enter data and position to insert:");
        int insertData = sc.nextInt();
        int position = sc.nextInt();
        list.insertAtPosition(insertData, position);

        System.out.println("Updated Linked List:");
        list.printList();
    }
}

