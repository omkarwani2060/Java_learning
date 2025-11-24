package MultiThreading.Digest_Eng.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class interrupt{
    private Lock lock = new ReentrantLock();

    void s1(){
        try{
            lock.lockInterruptibly();
            System.out.println(Thread.currentThread().getName() + " got the lock..");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName() + " Was interrupted!.. ");

        }
        finally {
            if (((ReentrantLock) lock).isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}

public class lockinterruptibly1 {
    public static void main(String[] args) throws InterruptedException {
        interrupt i1 = new interrupt();

        Thread t1 = new Thread(i1::s1,"omkar");
        Thread t2 = new Thread(i1::s1,"Gotya");

        t1.start();
        Thread.sleep(100);
        t2.start();
        Thread.sleep(500);
        t2.interrupt();


    }
}
