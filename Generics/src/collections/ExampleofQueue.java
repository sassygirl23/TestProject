package collections;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleofQueue {

    public static void main(String[] args) {

        // Queue is a FIFO
        Queue<String> queue = new LinkedList<>();

        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        // peek() titingin sa first element
        System.out.println(queue.peek());

        // poll() kukunin at aalisin ang first element
        System.out.println(queue.poll());

        System.out.println(queue);
    }
}