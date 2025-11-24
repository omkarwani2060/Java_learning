package MultiThreading.Digest_Eng.Locks;

                            // fairness of lock //

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Fairexample{
    private final Lock lock1 = new ReentrantLock(true);

    public void accessResource(){
        lock1.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        finally {
            System.out.println(Thread.currentThread().getName() + "  release the lock. ");
            lock1.unlock();

        }
    }

}
public class fairness {
    public static void main(String[] args) throws InterruptedException {

        Fairexample f1 = new Fairexample();

        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                f1.accessResource();
            }
        };

        Thread t1 = new Thread(run1 ,"Thread 1");
        Thread t2 = new Thread(run1 ,"Thread 2");
        Thread t3 = new Thread(run1 ,"Thread 3");

        t1.start();
        Thread.sleep(20);
        t2.start();
        Thread.sleep(40);
        t3.start();

    }
}
