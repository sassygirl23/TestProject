package concurrency;

class Counter {

    private int count = 0;

    // synchronized method
    synchronized void increment() {

        count++;
    }

    int getCount() {

        return count;
    }
}

public class Synchronization {

    public static void main(String[] args) {

        Counter counter =
                new Counter();

        counter.increment();
        counter.increment();

        System.out.println(
                counter.getCount());
    }
}