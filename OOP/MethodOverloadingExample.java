/**
 * Method Overloading:
 *
 * Method overloading allows a class to have more than one method with the same name, 
 * but with different parameters (either in number or type, or both).
 */

class MethodOverloading {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add a double and an integer
    public double add(double a, int b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        // Creating a reference variable 'over' and calling the overloaded methods using it
        MethodOverloading over = new MethodOverloading();
        
        System.out.println(over.add(2, 3, 6));   // Calling the method with three integer parameters
        System.out.println(over.add(4, 5));      // Calling the method with two integer parameters
        System.out.println(over.add(99999.99, 1)); // Calling the method with one double and one integer parameter
    }    
}
