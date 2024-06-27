// Quick Sort: Divide and Conquer
// In the worst case, the time complexity is O(n^2)
// In the best and average case, the time complexity is O(n log n)

public class QuickS {

    /**
     * This method implements the Quick Sort algorithm.
     * It recursively sorts the array by partitioning it into subarrays.
     * 
     * @param arr the array to be sorted
     * @param low the starting index
     * @param high the ending index
     */
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * This method partitions the array into two parts.
     * Elements less than the pivot are moved to the left of the pivot.
     * Elements greater than the pivot are moved to the right of the pivot.
     * 
     * @param arr the array to be partitioned
     * @param low the starting index
     * @param high the ending index
     * @return the index of the pivot
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, high, i + 1);
        return i + 1;
    }

    /**
     * This method swaps two elements in the array.
     * 
     * @param arr the array
     * @param i the first index
     * @param j the second index
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 78, 2, 1, 8};
        System.out.println("Before sorting: ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After sorting: ");
        printArray(arr);
    }

    /**
     * This method prints the elements of the array.
     * 
     * @param arr the array to be printed
     */
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
