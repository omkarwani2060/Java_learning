package MultiThreading.Digest_Eng.Method;

public class interrupted extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Thread Sleep...");
        }
        catch (InterruptedException e){
            System.out.println("Thread Interrupted :"+ e);
        }
    }

    public static void main(String[] args) {
        interrupted t1 = new interrupted();
        t1.start();
        t1.interrupt();     //INTERRUPTED METHOD()

    }
}
