// constructor: A constructor is a special method without any return type.
// We use constructors to assign default values to the instance variables.

class Tunu {
    private int chini;       // instance variable for sugar
    private int teaLeaves;   // instance variable for tea leaves

    // Default constructor
    public Tunu() {
        System.out.println("in constructor");
        // Default values for chini and teaLeaves are 0 (default for int)
    }

    // Parameterized constructor
    public Tunu(int chini, int teaLeaves) {
        this.chini = chini;
        this.teaLeaves = teaLeaves;
    }

    // Getter for chini
    public int getChini() {
        return chini;
    }

    // Setter for chini
    public void setChini(int chini) {
        this.chini = chini;
    }

    // Getter for teaLeaves
    public int getTeaLeaves() {
        return teaLeaves;
    }

    // Setter for teaLeaves
    public void setTeaLeaves(int teaLeaves) {
        this.teaLeaves = teaLeaves;
    }
}

public class ConstructorExample { 
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Tunu chai1 = new Tunu();
        System.out.println("Default number of spoons of chini: " + chai1.getChini());

        // Setting the number of spoons of chini
        chai1.setChini(5);

        // Creating an object using the parameterized constructor
        Tunu chai2 = new Tunu(4, 7);

        // Displaying the number of spoons of chini and tea leaves
        System.out.println("Number of spoons of chini and tea leaves Tunu bhiya wants in tea: " 
                            + chai2.getChini() + " " + chai2.getTeaLeaves());
    }
}
