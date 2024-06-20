// Insertion Sort

// Time complexity: O(n^2)

// Insertion sort works by dividing the array into a sorted and an unsorted part.
// Values from the unsorted part are picked and placed at the correct position in the sorted part.
// Unlike other sorting techniques that use swapping, insertion sort shifts elements.

public class InsertionS {
    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 4, 1, 9};

        // Call the insertion sort method to sort the array
        insertionSort(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /**
     * This method sorts the array using insertion sort algorithm.
     * 
     * @param arr the array to be sorted
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements of arr[0..i-1], that are greater than key, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
