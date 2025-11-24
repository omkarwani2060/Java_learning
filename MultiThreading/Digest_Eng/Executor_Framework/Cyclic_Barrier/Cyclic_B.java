package MultiThreading.Digest_Eng.Executor_Framework.Cyclic_Barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cyclic_B {
    public static void main(String[] args) {
        int numberSubSystem = 3;
        ExecutorService e1 = Executors.newFixedThreadPool(numberSubSystem);
        CyclicBarrier barrier = new CyclicBarrier(numberSubSystem, new Runnable() {
            @Override
            public void run() {
                System.out.println("All subsystem are up and running. System Startup Complate. ");
            }
        });

        Thread t1 = new Thread(new subsystem("web",1000,barrier));
        Thread t2 = new Thread(new subsystem("database",2000,barrier));
        Thread t3 = new Thread(new subsystem("Cache",3000,barrier));

        t1.start();
        t2.start();
        t3.start();

    }
}

class subsystem implements  Runnable{

    private String name;
    private  int initilizationTime;

    private CyclicBarrier barrier;

    public subsystem(String name, int initilizationTime ,CyclicBarrier barrier){
        this.name = name;
        this.initilizationTime = initilizationTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            System.out.println(name + " initialization started..");
            Thread.sleep(initilizationTime);
            System.out.println(name + " initialization Complated..");
            barrier.await();
        }
        catch (InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }

    }
}
