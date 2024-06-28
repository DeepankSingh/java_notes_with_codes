package LinkedLists;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(96);
        list.insert(17);
        list.insert(28);
        list.insert(9);
        list.insert(100);

        System.out.println("Printing LinkedList:");
        list.show();

        System.out.println("Inserted at beginning:");
        list.insertAtBeginning(77);
        list.show();

        System.out.println("Inserted at position 6:");
        list.insertAt(55, 6);
        list.show();

        System.out.println("Deleted from position 2:");
        list.deleteAt(2);
        list.show();
    }
}
