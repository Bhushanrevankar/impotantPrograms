public class CustomLinkedList {

    // 1. Define the Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head (starting point) of the list
    Node head;

    // --- INSERT AT BEGINNING ---
    // Time Complexity: O(1)
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        // Point the new node's next to the current head
        newNode.next = head;

        // Make the new node the new head of the list
        head = newNode;

        System.out.println("Inserted " + data + " at the beginning.");
    }

    // --- INSERT AT END ---
    // Time Complexity: O(N) where N is the number of nodes
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If the list is empty, the new node becomes the head
        if (head == null) {
            head = newNode;
            System.out.println("Inserted " + data + " at the end (first element).");
            return;
        }

        // Traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Attach the new node to the end
        current.next = newNode;
        System.out.println("Inserted " + data + " at the end.");
    }

    // Utility method to print the list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the code
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.insertAtBeginning(10);
        //list.insertAtEnd(20);
        list.insertAtEnd(30);
        //list.insertAtBeginning(5);

        // Expected output: 5 -> 10 -> 20 -> 30 -> null
        list.display();
    }
}