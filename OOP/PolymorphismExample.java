/**
 * Polymorphism:
 *
 * Polymorphism allows objects of different classes to be treated as objects of a common superclass.
 * It enables different behavior of the same reference at different times.
 *
 * There are two types of polymorphism:
 * 1. Runtime Polymorphism: Method overriding
 * 2. Compile-time Polymorphism: Method overloading (methods with the same name but different parameters)
 */

// Base class AB
class AB {
    public void show() {
        System.out.println("in AB");
    }
}

// Subclass BC extending AB
class BC extends AB {
    @Override
    public void show() {
        System.out.println("in BC");
    }
}

// Subclass CD extending BC
class CD extends BC {
    @Override
    public void show() {
        System.out.println("in CD");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        AB obj;

        // Runtime Polymorphism: Method overriding
        obj = new BC(); // Reference variable is of type AB and object is of type BC
        obj.show();

        // Runtime Polymorphism: Method overriding
        obj = new AB(); // Reference variable and object both are of type AB
        obj.show();

        // Runtime Polymorphism: Method overriding
        obj = new CD(); // Reference variable is of type AB and object is of type CD
        obj.show();
    }
}
