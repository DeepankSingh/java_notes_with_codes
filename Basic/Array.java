// A simple Java program that demonstrates the creation and usage of an array.
public class Array {
    public static void main(String[] args) {
        // Declare an integer variable 'x' and assign it a value of 5.
        int x = 5;
        
        // Create an integer array 'arr' of size 'x'.
        int[] arr = new int[x];

        // Iterate over the array using a for loop.
        for (int i = 0; i < arr.length; i++) {
            // Print the value of each element in the array.
            // Since the array is just created, it will contain the default value of 0 for each element.
            System.out.println(arr[i]);
        }
    }
}
