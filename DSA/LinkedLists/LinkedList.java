package LinkedLists;

// LinkedLists are expandable, unlike arrays which have a fixed size.
// However, arrays are faster in terms of accessing elements.

public class LinkedList {
    Node head; // This will refer to the first node

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            // If the list is empty, set the new node as head
            head = node;
        } else {
            Node n = head; // Temporary node to hold the head
            while (n.next != null) {
                // Traverse the list to find the last node
                n = n.next;
            }
            n.next = node; // Set the new node as the next of the last node
        }
    }

    // Method to insert a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    // Method to insert a new node at a specific index
    public void insertAt(int data, int index) {
        if (index == 0) {
            insertAtBeginning(data);
        } else {
            Node node = new Node();
            node.data = data;
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    // Method to delete a node at a specific index
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            Node n1 = n.next;
            n.next = n1.next;
            n1 = null; // Help garbage collection
        }
    }

    // Method to display the list
    public void show() {
        Node n = head;
        if (n == null) {
            System.out.println("List is empty");
        } else {
            while (n.next != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
            System.out.print(n.data); // Print the last node manually
        }
        System.out.println();
    }
}
