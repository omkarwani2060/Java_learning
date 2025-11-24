package MultiThreading.Learn_Coding.Thread_Scheduler;

class dis extends Thread{
    public void  run(){

        for(int i=1; i<=3;i++){
          //  String n = Thread.currentThread().getName();
            System.out.println( Thread.currentThread().getName()+ "Val");
        }
    }
}
public class new1 {
    public static void main(String[] args) {

        dis t1 = new dis();
        dis t2 = new dis();
        dis t3 = new dis();

//        t1.setName("Thread 1");
//        t2.setName("Thread 2");
//        t3.setName("Thread 3");
        t1.setPriority(1);
        t2.setPriority(8);
        t3.setPriority(6);

        t1.start();
        t2.start();
        t3.start();

        for(int i=1; i<=3;i++){
          //  String n = Thread.currentThread().getName();
          //  System.out.println(n);
            System.out.println(Thread.currentThread().getName());
        }

    }
}
