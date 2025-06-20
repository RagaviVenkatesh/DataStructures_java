package linkedList;

import java.util.Scanner;

public class searchOperation {
	Node head;
	// Append a new node to the list
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

    // Search using two pointers
    public boolean search(int key) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        // Traverse using two pointers
        while (fast != null && fast.next != null) {
            if (slow.data == key) {
                return true; // Found the key at slow pointer
            }
            slow = slow.next;
            fast = fast.next.next;  // Fast pointer moves 2 steps
        }

        // Check the last node if not caught by the loop
        if (slow.data == key) {
            return true;
        }

        return false;  // Key not found
    }

    // Print the list
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
