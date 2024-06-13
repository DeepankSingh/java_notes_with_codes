public class LinearAndBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 10, 23, 45};
        int target = 23;

        int result1 = linearSearch(arr, target);
        int result2 = binarySearch(arr, target, 0, arr.length - 1);

        if (result1 != -1) {
            System.out.println("Element found at index " + result1 + " using linear search");
        } else {
            System.out.println("Element not found in the array using linear search");
        }

        if (result2 != -1) {
            System.out.println("Element found at index " + result2 + " using binary search");
        } else {
            System.out.println("Element not found in the array using binary search");
        }
    }

    /**
     * Linear search: This method starts from the beginning of the array and compares each value
     * to the target value until it finds a match or reaches the end of the array.
     * 
     * @param a the array to search
     * @param t the target value
     * @return the index of the target value if found, otherwise -1
     */
    public static int linearSearch(int[] a, int t) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Binary search: This method uses a divide-and-conquer approach to search for the target value.
     * It calculates the middle index of the current search range and compares the middle value to the target value.
     * If the middle value equals the target, it returns the middle index.
     * If the middle value is less than the target, it searches the right half of the range.
     * If the middle value is greater than the target, it searches the left half of the range.
     * 
     * This is the recursive approach for binary search.
     * 
     * @param a the sorted array to search
     * @param t the target value
     * @param low the lower bound of the search range
     * @param high the upper bound of the search range
     * @return the index of the target value if found, otherwise -1
     */
    public static int binarySearch(int[] a, int t, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (a[mid] == t) {
            return mid;
        } else if (a[mid] > t) {
            return binarySearch(a, t, low, mid - 1);
        } else {
            return binarySearch(a, t, mid + 1, high);
        }
    }

    /**
     * Uncomment the following method to use the iterative approach for binary search.
     * 
     * @param a the sorted array to search
     * @param t the target value
     * @param low the lower bound of the search range
     * @param high the upper bound of the search range
     * @return the index of the target value if found, otherwise -1
     */
//    public static int binarySearchIterative(int[] a, int t, int low, int high) {
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (a[mid] == t) {
//                return mid;
//            } else if (a[mid] < t) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//        return -1;
//    }
}
