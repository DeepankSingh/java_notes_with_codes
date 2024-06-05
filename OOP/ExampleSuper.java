/*
 * Super Keyword:
 *
 * The `super` keyword in Java is used to call the constructor of the superclass.
 *
 * When we create a subclass object, the constructor of the superclass is called first.
 * This is because every class in Java extends the `Object` class, either directly or indirectly (multi-level inheritance).
 *
 * We use `super()` to explicitly call the parameterized constructor of the superclass.
 * If `super()` is not explicitly mentioned, the default constructor of the superclass is called.
 *
 * The `this()` keyword is used to call another constructor of the same class.
 */

class A {
    
    // Default constructor of class A
    public A() {
        super(); // super keyword is implicitly there if we don't mention it
        System.out.println("in A");
    }

    // Parameterized constructor of class A
    public A(int b) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    
    // Default constructor of class B
    public B() {
        super(); // Calls the default constructor of superclass A
        System.out.println("in B");
    }

    // Parameterized constructor of class B
    public B(int x) {
        this(); // Calls the default constructor of class B
        System.out.println("in B int");
    }
    
    // An empty method in class B
    public void K() {
        // This method currently does nothing
    }
}

public class ExampleSuper {
    public static void main(String[] args) {
        B n = new B(6); // Creating an object of class B with an integer argument
        n.K();          // Calling method K of class B
    }
}
