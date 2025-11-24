package MultiThreading.Digest_Eng.Executor_Framework.Future;

import java.util.concurrent.*;

public class Future_cancel {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newSingleThreadExecutor();

        Future<Integer> f1 = ex.submit( () -> {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Exception Occured :"+ e );
            }
           return 23;
        });

//        f1.cancel(true);                              // cancel method
        System.out.println(f1.isCancelled());
        try{
            System.out.println(f1.get());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }catch (CancellationException c){
            throw new RuntimeException(c);
        }
        ex.shutdown();

    }
}
