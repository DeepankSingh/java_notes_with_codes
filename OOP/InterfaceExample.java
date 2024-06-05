/*
 * Interface:
 *
 * Interfaces in Java are abstract by default, which means we cannot create objects of the interface.
 * 
 * Methods inside the interface are abstract by default and must be implemented by the class that implements the interface.
 * 
 * Variables inside the interface are final and static by default.
 * 
 * Relationship:
 * - Interface to Interface: extends
 * - Class to Interface: implements
 * - Interface to Class : implements
 */

interface X {
    int a = 0; // Variable is final and static by default

    void show();
    void config();
}

// Here Z is an interface and X is also an interface therefore we used extends
interface Z extends X {
    void run();
}

// Here Y is a class and Z is and interface therefore we used implements
class Y implements Z {
    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

    @Override
    public void run() {
        System.out.println("running...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        X obj;

        obj = new Y();
        obj.config();
        obj.show();

        Z obj1 = new Y();
        obj1.run();
    }
}
