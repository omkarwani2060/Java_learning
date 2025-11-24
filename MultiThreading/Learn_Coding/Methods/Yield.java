package MultiThreading.Learn_Coding.Methods;

class A implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<3;i++){
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }
}
class B extends Thread{
    @Override
    public void run() {
        for(int i=0; i<3;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class Yield {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();

        Thread tt = new Thread(t1);


        tt.start();
        t2.start();

    }
}
