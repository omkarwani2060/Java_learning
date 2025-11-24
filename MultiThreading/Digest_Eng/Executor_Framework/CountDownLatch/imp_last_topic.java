package MultiThreading.Digest_Eng.Executor_Framework.CountDownLatch;

import java.util.concurrent.*;

public class imp_last_topic {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int Numberofservices = 4;
        ExecutorService e1 = Executors.newFixedThreadPool(Numberofservices);
        CountDownLatch latch = new CountDownLatch(Numberofservices);

//        Future<String> f1 =e1.submit( new Depend());
//        Future<String> f2 =e1.submit( new Depend());
//        Future<String> f3 =e1.submit( new Depend());
//        f1.get();
//        f2.get();
//        f3.get();
//        System.out.println("All depended service finished! Starting Main Sevice...");
//        e1.shutdown();

//        e1.submit( new Depend(latch));
//        e1.submit( new Depend(latch));
//        e1.submit( new Depend(latch));
//        e1.submit( new Depend(latch));
//        latch.await();

        for(int i=0 ; i<Numberofservices;i++){                  // for loop of coundDownlatch print,
            new Thread(new Depend(latch)).start();              // all thread are work.
        }

        latch.await();
        System.out.println("Main");
        e1.shutdown();
    }

}

class Depend implements Runnable{

    public final CountDownLatch latch;
    public Depend(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {

       try{
           System.out.println(Thread.currentThread().getName() + " Serviced..");
           Thread.sleep(1000);
       }
       catch(InterruptedException e){

       }
       finally {
           latch.countDown();
       }
    }
}
