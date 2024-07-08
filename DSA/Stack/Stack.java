public class Stack {
    int[] stack = new int[10];
    int top = 0;

    // Method to add an element to the stack
    public void push(int data) {
        if (top == stack.length) {
            System.out.println("Stack overflow");
        } else {
            stack[top] = data;
            top++;
        }
    }

    // Method to remove an element from the stack
    public int pop() {
        if (top == 0) {
            System.out.println("Stack underflow");
            return -1; // Return an invalid value to indicate underflow
        } else {
            top--;
            int data = stack[top];
            stack[top] = 0; // Clear the popped element
            return data;
        }
    }

    // Method to display the stack
    public void show() {
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
