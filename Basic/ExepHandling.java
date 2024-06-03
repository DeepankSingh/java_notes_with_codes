// Exception handling in Java

public class ExepHandling { 
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        try {
            // Attempt to divide x by y
            x = 10 / y;
            // This condition is unnecessary as it will never be reached if y is 0
            if (y == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            // Catching and handling the division by zero error
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Catching any other types of exceptions
            System.out.println("An unexpected error occurred.");
        }

        // This line will be executed after the exception handling block
        System.out.println(x + y + 1);
    }
}
