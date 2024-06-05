/*
 * Abstract Keyword:
 *
 * The `abstract` keyword is used to declare abstract methods, which are methods without a body.
 * These methods must be implemented by subclasses.
 *
 * An abstract method must be declared in an abstract class.
 *
 * We cannot create instances (objects) of an abstract class directly.
 * 
 * Abstract classes can contain both abstract methods and concrete (non-abstract) methods.
 * 
 * In the example below, we have an abstract class `Car` with abstract methods `drive` and `drift`.
 * A concrete class `UpdatedGwagon` extends the abstract class and provides implementations for the abstract methods.
 */

abstract class Car {
    public abstract void drive();
    public abstract void drift();

    public void playMusic() {
        System.out.println("Playing music");
    }
}

// Abstract class Gwagon extends Car and provides an implementation for drive
abstract class Gwagon extends Car {
    @Override //this is an anotation. anotation are used to make it clear that what is happening to the method. for example here we are overriding so we mentioned @override
    public void drive() {
        System.out.println("Driving ... ");
    }
}

// Concrete class UpdatedGwagon extends Gwagon and provides an implementation for drift
class UpdatedGwagon extends Gwagon {
    @Override
    public void drift() {
        System.out.println("Drifting ...");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // Create an instance of UpdatedGwagon, which is a concrete class
        UpdatedGwagon obj = new UpdatedGwagon();
        obj.playMusic();
        obj.drive();
        obj.drift();
    }
}
