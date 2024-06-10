import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * A stream in Java is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
 * 
 * Stream enable us to perform operations like filtering, mapping,reducing and sorting.
 * 
 * This example demonstrates the use of Java Stream API to process a list of integers.
 * 
 */
public class StreamAPI {
    public static void main(String[] args) {
        
        // Creating a list of integers
        List<Integer> nums = Arrays.asList(1, 2, 9, 3, 4, 5, 6);
       
        // Creating a stream from the list
        Stream<Integer> stream = nums.stream();
        
        // Filtering even numbers
        Stream<Integer> filteredStream = stream.filter(n -> n % 2 == 0);
        
        // Mapping each even number to its double
        Stream<Integer> mappedStream = filteredStream.map(n -> n * 2);
        
        // Reducing the stream to sum up the doubled even numbers
        int result = mappedStream.reduce(0, Integer::sum);
        
        // Printing the result
        System.out.println("Sum of doubled even numbers: " + result);

        // Alternative approach without Stream API
        // int sum = 0;
        // for (Integer i : nums) {
        //     if (i % 2 == 0) {
        //         sum = i * 2 + sum; 
        //     } 
        // }
        // System.out.println("Sum of doubled even numbers (without Stream API): " + sum);
    }
}
