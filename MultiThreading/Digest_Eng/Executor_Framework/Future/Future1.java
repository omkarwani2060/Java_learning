package MultiThreading.Digest_Eng.Executor_Framework.Future;

import java.util.concurrent.*;

public class Future1 {
    public static  void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future <?> future = service.submit(() -> System.out.println("Hello"));
        System.out.println(future.get());
        if(future.isDone()){
            System.out.println("Task is Done!.");
        }

        Runnable run = () -> System.out.println("Hello Dada...");
        Future <?> future1 = service.submit(run);                       // Runnable
//        System.out.println(future1.get());


        Callable <?> callable = () -> "Omkar Dada";                     //Callable
        Future <?> future2 = service.submit(callable);
        System.out.println(future2.get());


        Future <?> future3 = service.submit( () -> System.out.println("Omkar"),"Success");
        System.out.println(future3.get());
        service.shutdown();

    }
}
