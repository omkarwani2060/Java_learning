package MultiThreading.Learn_Coding.Sleep_Join;

class demo extends Thread{
    @Override
    public void run(){
        for(int i=1; i<=3;i++){
            System.out.println(Thread.currentThread().getName()+ " ..");
        }
    }
}
public class join {
    public static void main(String[] args) throws InterruptedException {

        demo d1 = new demo();
        demo d2 = new demo();

        d1.setName("d1");
        d2.setName("d2");

        d1.start();
        d1.join();       // main thread waits until d1 finishes

        d2.start();     //  starts after d1 is done

    }
}
