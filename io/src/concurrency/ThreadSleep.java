package concurrency;

public class ThreadSleep {

    public static void main(String[] args)
            throws InterruptedException {

        System.out.println("Start");

        // Pause thread for 2 seconds
        Thread.sleep(2000);

        System.out.println("End");
    }
}