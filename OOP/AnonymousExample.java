/*
 * Anonymous Classes:
 *
 * Anonymous classes are classes without a name.
 * Inner anonymous classes are classes defined inside another class without a name.
 *
 * Inner anonymous classes are used to change the behavior (definition or implementation) of a method 
 * without overriding it using inheritance.
 *
 * Inner anonymous classes are typically used when the class is only going to be used once.
 * 
 * If we need to use a method multiple times, it's better to create a new class.
 *
 * Anonymous inner classes can be used with both abstract classes and normal classes.
 */

abstract class AC {
    public abstract void show();
}

// This is the normal overriding method, but we will use the inner anonymous class method.
// class BD extends AC{
//     public void show(){
//         System.out.println("in BD show");
//     }
// }

public class AnonymousExample {
    public static void main(String[] args) {
        // Using an anonymous inner class to provide an implementation for the abstract method
        AC obj = new AC() {
            @Override
            public void show() {
                System.out.println("in new show");
            }
        };

        obj.show();
    }
}
