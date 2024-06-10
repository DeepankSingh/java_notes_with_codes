/*
 * HashMap:
 *
 * HashMap is used to store data in key-value pairs.
 * In this example, we use a Hashtable (which is a synchronized variant of HashMap) to store student names as keys and their scores as values.
 */

import java.util.Hashtable;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a Hashtable to store student names and their scores
        Map<String, Integer> students = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        students.put("Deepank", 100);
        students.put("Krishna", 60);
        students.put("Shivam", 90);
        students.put("Nandini", 80);

        // Printing all the keys (student names)
        System.out.println("Student names: " + students.keySet());

        // Iterating over the keys and printing each key-value pair
        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}
