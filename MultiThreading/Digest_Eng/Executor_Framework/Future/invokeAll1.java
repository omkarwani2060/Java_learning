package MultiThreading.Digest_Eng.Executor_Framework.Future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class invokeAll1 {
    public static void main(String[] args) throws InterruptedException, ExecutionException ,CancellationException{
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> c1 = () -> {
            Thread.sleep(1000);
            System.out.println("Hello");
                return 1;};

        Callable<Integer> c2 = () -> {
            Thread.sleep(1000);
            System.out.println("World");
            return 2;
        };

        Callable<Integer> c3 = () -> {
            Thread.sleep(100);
            System.out.println("Good ");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(c1,c2,c3);

        List<Future<Integer>> future1 = executor.invokeAll(list,1010,TimeUnit.MILLISECONDS);


        for(Future<Integer> f1 : future1){
           try{
               System.out.println(f1.get());
           }catch (CancellationException e){
               System.out.println("Exception...");
           }
        }

        executor.shutdown();
        System.out.println("Omkar Wani...");

    }
}
