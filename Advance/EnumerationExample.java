/*
 * Enums:
 *
 * Enums are used to declare named constants.
 * By default, enums extend the `Enum` class and cannot extend any other class.
 *
 * In this example, we define an enum `Mobile` with named constants representing different mobile phone brands.
 * Each enum constant can have its own attributes and methods.
 */

enum Mobile {
    // Defining enum constants with optional prices
    Redmi(1000), Samsung, Iphone(3000), GooglePixel(5000);

    // Attribute to hold the price of the mobile
    private int price;

    // Default constructor with a default price
    private Mobile() {
        this.price = 500;
    }

    // Parameterized constructor to set the price
    private Mobile(int price) {
        this.price = price;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Setter for price (not commonly used for enum constants)
    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumerationExample {
    public static void main(String[] args) {
        // Iterating over the enum constants and printing their prices
        for (Mobile phone : Mobile.values()) {
            System.out.println(phone + " : " + phone.getPrice());
        }
    }
}
