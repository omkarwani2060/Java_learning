package MultiThreading.Digest_Eng.Locks;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReadWriteCounter {
    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock Readlock = lock.readLock();

    private final Lock Writelock = lock.writeLock();

    public void increment(){
        Writelock.lock();
        try{
            count++;
            Thread.sleep(50);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        finally{
            Writelock.unlock();
        }
    }

    public int getCount(){
        Readlock.lock();
        try{
            return count;
        }
        finally{
            Readlock.unlock();
        }
    }

    public static void main(String[] args) throws  InterruptedException{

        ReadWriteCounter rw1 = new ReadWriteCounter();

        Runnable Readtask = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println(Thread.currentThread().getName() + " Read "+ rw1.getCount());
                }
            }
        };

        Runnable Writetask = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    rw1.increment();
                    System.out.println(Thread.currentThread().getName() + " Incremented .. ");
                }
            }
        };

        Thread Write1 = new Thread(Writetask);
        Thread Read1 = new Thread(Readtask);
        Thread Read2 = new Thread(Readtask);

        Write1.start();
        Read1.start();
        Read2.start();

        Write1.join();
        Read1.join();
        Read2.join();

        System.out.println("Final count : "+ rw1.getCount());


    }
}
