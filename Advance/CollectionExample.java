/*
 * Collection API:
 * 
 * The Collection API is a framework that provides an architecture to store and manipulate a group of objects.
 * 
 * - Collection is an interface.
 * - Collections is a utility class.
 * 
 * Collection Interface includes:
 * - List (e.g., ArrayList, LinkedList, etc.)
 * - Queue (e.g., PriorityQueue, Deque, etc.)
 * - Set (e.g., HashSet, TreeSet, etc.)
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionExample {
    public static void main(String[] args) {
        // Using ArrayList which implements Collection interface
        Collection<Integer> num = new ArrayList<>();
        num.add(33);
        num.add(29);
        num.add(79);

        // Iterating over the ArrayList using an Iterator
        Iterator<Integer> values = num.iterator();
        System.out.println("ArrayList elements:");
        while (values.hasNext()) {
            System.out.println(values.next());
        }

        // Using HashSet which implements Collection interface
        Collection<Integer> nums = new HashSet<>();
        nums.add(55);
        nums.add(29);
        nums.add(19);

        // Iterating over the HashSet using an Iterator
        Iterator<Integer> value = nums.iterator();
        System.out.println("HashSet elements:");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }    
}
