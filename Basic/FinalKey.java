// The final keyword in Java

// Variables -> final keyword makes a variable constant (you can't change its value)
// Methods -> using final keyword with methods stops method overriding
// Classes -> using final keyword with classes stops inheritance

class A1 {
    // This method is final, so it cannot be overridden in subclasses
    final public void show() {
        System.out.println("in A");
    }
}

// This class is final, so it cannot be extended by any other class
final class B1 extends A1 {
    // Uncommenting the below method will cause a compilation error
    // because the show() method in A1 is final and cannot be overridden.
    // public void show() {
    //     System.out.println("in B");
    // }
}

// Uncommenting the below class will cause a compilation error
// because B1 is declared as final and cannot be extended.
// class C1 extends B1 {
//     public void show() {
//         System.out.println("in C");
//     }
// }

public class FinalKey { 
    public static void main(String[] args) {
        final int c = 9;
        // Uncommenting the below line will cause a compilation error
        // because c is declared as final and its value cannot be changed.
        // c = 20; 

        // Print the value of the final variable c
        System.out.println(c);
    }
}
