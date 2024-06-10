import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * This example demonstrates sorting a list of Student objects using Comparable and Comparator interfaces.
 */

// Student class implementing Comparable interface to define natural ordering
class Student implements Comparable<Student> {
    String name;
    int mark;
    
    public Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }

    // toString method to provide a string representation of the Student object
    @Override
    public String toString() {
        return "Student [name = " + name + ", mark = " + mark + "]";
    }

    // compareTo method to define the natural ordering based on marks
    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.mark, that.mark);
    }
}

public class SortStudents {
    public static void main(String[] args) {
        
        // Creating a custom comparator for Student objects based on marks
        Comparator<Student> markComparator = (i, j) -> Integer.compare(i.mark, j.mark);

        // Creating a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Deepank", 80));
        students.add(new Student("Navin", 70));
        students.add(new Student("Nandni", 100));
        students.add(new Student("Krishna", 90));
        students.add(new Student("Om", 90));

        // Sorting the list of students using their natural ordering (based on marks)
        Collections.sort(students);

        // Printing the sorted list of students
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting the list of students using the custom comparator (based on marks)
        Collections.sort(students, markComparator);

        // Printing the sorted list of students again
        System.out.println("Sorted using custom comparator:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
