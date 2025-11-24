package MultiThreading.Digest_Eng.Locks.tryLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class bankAccount1{
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdrow(int amount){
        System.out.println(Thread.currentThread().getName() + " Attemping to withdrow "+ amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " Proccessing with withdrow..");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "  Complated Withdrow : Remaining Balance " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName() + " Insufficient Balance.  ");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName() + " Could not acquire the lock, will try later.");
            }
        }
        catch (Exception e){
           Thread.currentThread().interrupt();
        }
    }
}
public class account1 {
    public static void main(String[] args) {
        bankAccount1 sbi = new bankAccount1();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                sbi.withdrow(40);
            }
        };
        Thread t1 = new Thread(runnable,"omkar");
        Thread t2 = new Thread(runnable,"karan");
        t1.start();
        t2.start();
    }
}


