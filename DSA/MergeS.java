// Merge Sort

// Merge sort is an efficient, stable, comparison-based, divide and conquer sorting algorithm.
// Most implementations produce a stable sort, meaning that the implementation preserves the input order of equal elements in the sorted output.
// It has a time complexity of O(n log n).

public class MergeS {

    /**
     * This method recursively divides the array into two halves, sorts each half, and then merges them.
     * 
     * @param arr the array to be sorted
     * @param l the starting index
     * @param r the ending index
     */
    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    /**
     * This method merges two subarrays of arr[].
     * First subarray is arr[l..mid]
     * Second subarray is arr[mid+1..r]
     * 
     * @param arr the array to be sorted
     * @param l the starting index
     * @param mid the middle index
     * @param r the ending index
     */
    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        // Copy data to temporary arrays lArr[] and rArr[]
        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            rArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;

        // Merge the temporary arrays back into arr[l..r]
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of lArr[], if any
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rArr[], if any
        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 8, 9, 5};

        System.out.println("Before sorting: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting: ");
        printArray(arr);
    }

    /**
     * This method prints the elements of the array.
     * 
     * @param arr the array to be printed
     */
    private static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
