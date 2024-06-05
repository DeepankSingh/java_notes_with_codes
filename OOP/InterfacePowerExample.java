/*
 * Power of Interface:
 *
 * An interface in Java allows for a class to specify methods that must be implemented by any class that implements the interface.
 * This provides a way to achieve abstraction and multiple inheritance.
 */

interface Computer {
    void code();
}

class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    @Override
    public void code() {
        System.out.println("code, compile, run: faster");
    }
}

class Developer {
    // Method to develop an application using a Computer
    public void devApp(Computer comp) {
        comp.code();
    }
}

public class InterfacePowerExample {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer deepank = new Developer();
        deepank.devApp(lap);
    }
}
