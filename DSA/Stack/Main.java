public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        System.out.println("Stack after pushing elements:");
        stack.show();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after popping an element:");
        stack.show();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after popping another element:");
        stack.show();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after popping another element:");
        stack.show();
    }
}
