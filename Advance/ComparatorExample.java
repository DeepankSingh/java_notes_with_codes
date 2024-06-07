/*
 * Comparator:
 *
 * The Comparator interface is used to define custom logic for sorting objects.
 * It is used when we need to sort objects that do not have a natural ordering or when we want to define multiple sort orders.
 *
 * In this example, we will sort a list of integers based on the last digit of each integer.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        // Creating a custom comparator to sort integers based on the last digit
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Comparing based on the last digit of the numbers
                if (o1 % 10 > o2 % 10) {
                    return 1;
                } else if (o1 % 10 < o2 % 10) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        // Creating a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(31);
        numbers.add(45);
        numbers.add(30);
        numbers.add(20);

        // Sorting the list using the custom comparator
        Collections.sort(numbers, com);
        System.out.println("Sorted list based on the last digit: " + numbers);
    }
}
