package concurrency;

import java.util.concurrent.*;

public class CallableF {

    public static void main(String[] args)
            throws Exception {

        ExecutorService service =
                Executors.newSingleThreadExecutor();

        Callable<Integer> task =
                () -> 100;

        Future<Integer> result =
                service.submit(task);

        System.out.println(
                result.get());

        service.shutdown();
    }
}