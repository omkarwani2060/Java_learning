package MultiThreading.Learn_Coding.Sleep_Join;

class dis extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class Join1 {
    public static void main(String[] args) {
        dis t1 = new dis();
        dis t2 = new dis();
        dis t3 = new dis();


        t3.start();
        try{
            t3.join();              // first print Thread 2 in print 3 time
        }catch (InterruptedException ignore){

        }
        t2.start();
        t1.start();

        for(int i=1;i<=3;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
