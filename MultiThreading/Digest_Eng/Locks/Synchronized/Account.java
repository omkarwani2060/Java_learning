package MultiThreading.Digest_Eng.Locks.Synchronized;

class bankAccount{
    private int balance = 100;

    public synchronized void withdrow(int amount){
        System.out.println(Thread.currentThread().getName() + " Attemping to withdrow "+ amount);
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " Proccessing with withdrow..");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "  Complated Withdrow : Remaining Balance "+ balance);
        }
        else {
            System.out.println(Thread.currentThread().getName() +" Insufficient Balance.  ");
        }

    }
}
public class Account {
    public static void main(String[] args) {
        bankAccount sbi = new bankAccount();
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
