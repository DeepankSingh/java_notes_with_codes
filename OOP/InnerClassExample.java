/*
 * Inner Class:
 *
 * An inner class is a nested class defined within another class.
 * 
 * Inner classes can be categorized as static or non-static.
 * 
 * Static inner classes do not require an instance of the outer class to be instantiated.
 * Non-static inner classes require an instance of the outer class to be instantiated.
 */

class Square {
    // Outer class cannot be static
    int length;

    // Method to calculate the perimeter of a rectangle
    public int perimeter(int a, int b) {
        return 2 * (a + b);
    }

    // Static inner class to calculate the area
    static class Area {
        // Method to calculate the area of a rectangle
        public int areaOfRectangle(int a, int b) {
            return a * b;
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        Square obj = new Square();
        System.out.println("Perimeter: " + obj.perimeter(2, 4));

        // Using the static inner class
        Square.Area obj1 = new Square.Area();
        System.out.println("Area: " + obj1.areaOfRectangle(4, 6));
    }
}
