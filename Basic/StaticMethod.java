// Static methods are those methods which are part of a class rather than an instance of a class.
// Static methods can be called without creating an object of the class.

class ExampleStatic {
    int roll; // Instance variable

    // Static method
    public static void statMethod() {
        System.out.println("Hello");
    }

    // Instance method
    // public int add() {
    //     return 10 + 20;
    // }

    // Static method that takes an instance of ExampleStatic as a parameter
    public static int getRoll(ExampleStatic instance) {
        return instance.roll;
    }
}

public class StaticMethod { 
    public static void main(String[] args) {
        // Calling the static method directly using the class name
        ExampleStatic.statMethod();

        // Creating an object to set and get the roll number
        ExampleStatic stat = new ExampleStatic();
        stat.roll = 2345;
        
        // Uncomment the following line to call the instance method 'add'
        // System.out.println(stat.add());

        // Print the roll number
        System.out.println(stat.roll);

        // Calling the static method getRoll and passing the object 'stat'
        System.out.println(ExampleStatic.getRoll(stat));
    }
}
