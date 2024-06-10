/*
 * Multithreading:
 *
 * Multithreading is used to execute multiple threads (methods) in parallel. 
 * This example demonstrates creating threads using the Runnable interface, which is a functional interface with a single method `run`.
 */

public class MultiThread {
    public static void main(String[] args) {
        // Runnable implementation using lambda expressions
        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Deepank");
                try { 
                    Thread.sleep(10); // Sleep for 10 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Nandini");
                try { 
                    Thread.sleep(15); // Sleep for 15 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Creating Thread objects and passing the Runnable tasks
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
