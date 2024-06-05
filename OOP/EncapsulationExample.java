/*
 * Encapsulation:
 *
 * Encapsulation is a concept where data (variables) is hidden from other classes and can only be accessed through methods of the current class.
 *
 * This is similar to a capsule, where the medicine is hidden inside. In encapsulation, data is hidden and protected within the class.
 *
 * In the example below, we have a class named `Human` with a private variable `name`.
 * The variable `name` is not directly accessible from outside the class. 
 * To access and modify the variable, we provide public getter and setter methods.
 */

class Human {
    private String name;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        // 'this' keyword is used to refer to the current object's instance variable
        this.name = name;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Deepank");
        System.out.println(h1.getName());
    }
}
