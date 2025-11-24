package MultiThreading.Digest_Eng.Create.By_Interface;

class open1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Runnable1 {
    public static void main(String[] args) {

        open1 o1 = new open1();
        Thread t1 = new Thread(o1);     // the implemenation class object to pass through the thread constructor.
        t1.start();

    }
}
