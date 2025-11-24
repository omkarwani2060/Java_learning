package MultiThreading.Digest_Eng.Executor_Framework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class with_ext {
    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i=1; i<10;i++){
            int finalI = i;
            executor.submit(   () -> {
                System.out.println(fact(finalI));
            });
        }
        executor.shutdown();

        try{
            while(!  executor.awaitTermination(100, TimeUnit.MILLISECONDS)){
                System.out.println("Waiting..");
            }
        }catch (InterruptedException e){
          //  throw new RuntimeException(e);
            Thread.currentThread().interrupt();
        }
        System.out.println("Total Time :"+ (System.currentTimeMillis() - startTime));




    }
    public static long fact(int n){
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        int result = 1;
        int i=1;
        while(i<=n){
            result *= i;
            i++;
        }
        return result;
    }
}
