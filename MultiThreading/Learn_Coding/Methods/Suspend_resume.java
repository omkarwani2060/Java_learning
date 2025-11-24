package MultiThreading.Learn_Coding.Methods;

class new1 extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=3;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class Suspend_resume {
    public static void main(String[] args) {

        new1 t1 = new new1();
        new1 t2 = new new1();
        new1 t3 = new new1();

        t1.setName("Omkar");
        t2.setName("Mahesh");
        t3.setName("Karan");

        t1.start();
        t2.start();

        // the suspend and resume are deprecated . they are old control thread.
    }
}
