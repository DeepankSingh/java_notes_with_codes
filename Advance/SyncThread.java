// Avoiding race condition using synchronized keyword
// The join method is used to tell the main method to wait for threads to finish execution before proceeding
class Counter {
    int count;

    // Synchronized method to prevent race condition
    public synchronized void increment() {
        count++;
    }

    // Getter method to retrieve the count value
    public int getCount() {
        return count;
    }
}

public class SyncThread {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // Wait for both threads to finish execution
        t1.join();
        t2.join();

        // Print the final count value
        System.out.println(c.getCount());
    }
}
