package MultiThreading.Digest_Eng.ComplatebleFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture cf1 =  CompletableFuture.supplyAsync( () -> {
            try{
                Thread.sleep(5000);
                System.out.println("Worker Thread.");
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Ok ..";
        });

        String s = null;
        s = (String) cf1.getNow("NoOOOO");
        System.out.println(s);

//        cf1.get();
        System.out.println("Main");


        // two Complateble Future :-


        CompletableFuture f1 =  CompletableFuture.supplyAsync( () -> {
            try{
                Thread.sleep(5000);
                System.out.println("Worker Thread1 .");
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Ok ..";
        });

        CompletableFuture f2 =  CompletableFuture.supplyAsync( () -> {
            try{
                Thread.sleep(5000);
                System.out.println("Worker Thread 2.");
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Ok ..";
        });


        CompletableFuture<Void> f =  CompletableFuture.allOf(f1,f2);
        f.join();                  // this are result value can complated ,or Throws unchecked Exception.
        System.out.println("Main_2");

    }
}
