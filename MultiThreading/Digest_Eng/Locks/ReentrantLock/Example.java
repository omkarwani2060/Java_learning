package MultiThreading.Digest_Eng.Locks.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentralExample{
    private Lock lock = new ReentrantLock();

    public void outer(){
        lock.lock();
        try{
            System.out.println("Outer Block ");
            innter();
        }
        finally{
            lock.unlock();
        }
    }

    public void innter(){
        lock.lock();
        try{
            System.out.println("Inner Block ");
        }
        finally {
            lock.unlock();
        }
    }
}
public class Example {
    public static void main(String[] args) {
        ReentralExample re = new ReentralExample();
        re.outer();
    }

}
