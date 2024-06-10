/*
 * Class and Object:
 *
 * A class is a blueprint for creating objects. It defines the properties (fields) and behaviors (methods) that the objects created from the class can have.
 * In this example, we define a class `Calculator` with a method `sum` to add two integers.
 */

class Calculator {
    // Method to calculate the sum of two integers
    public int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of type Calculator
        // (it is a non-primitive data type, therefore it is a reference variable and it is stored in heap memory)
        Calculator calc = new Calculator();
        
        // Calling the sum method and storing the result
        int result = calc.sum(54, 6);
        
        // Printing the result
        System.out.println("Sum: " + result);
    }
}
