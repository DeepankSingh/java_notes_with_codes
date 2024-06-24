// Bubble Sort

// Bubble sort is not an efficient sorting algorithm because it goes through all iterations,
// which means even if the sorting is done in the first iteration, Bubble sort will check again 
// and again until all iterations are completed. Therefore, the time complexity for bubble sort is O(n^2).

// Working: Bubble sort compares the first and the second value of the array. If the first value is greater 
// than the second value, they will swap, and then it will compare the second value and the third value. 
// This keeps going on until all iterations are done. With every iteration, one element reaches its correct position.

public class BubbleS {
    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 9, 5, 10};

        // Print the array before sorting
        System.out.println("Before sorting: ");
        printArray(arr);

        // Perform bubble sort
        bubbleSort(arr);

        // Print the array after sorting
        System.out.println("After sorting: ");
        printArray(arr);
    }

    /**
     * This method sorts the array using bubble sort algorithm.
     * 
     * @param arr the array to be sorted
     */
    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        int temp;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * This method prints the elements of the array.
     * 
     * @param arr the array to be printed
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
