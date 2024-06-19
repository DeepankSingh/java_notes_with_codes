// Selection Sort

// In this sorting technique, we start with the first value and compare it to all next values.
// If a smaller value than the current one appears, we keep track of the index of the smaller value.
// After going through the list, we swap the first value with the smallest value found in the rest of the list.
// We repeat this process for each position in the list until the entire array is sorted.

// Time complexity is O(n^2), but it generally takes fewer iterations than bubble sort.

public class SelectionS {
    public static void main(String[] args) {

        int[] arr = {8, 3, 6, 1, 9, 2};
        int size = arr.length;

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("After sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /**
     * This method sorts the array using selection sort algorithm.
     * 
     * @param arr the array to be sorted
     */
    public static void selectionSort(int[] arr) {
        int size = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < size - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
