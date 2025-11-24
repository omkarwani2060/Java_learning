package MultiThreading.Digest_Eng.Locks.Deadlock;

class Pen{
    public synchronized void writeWithPenAndPepar(Pepar paper){
        System.out.println(Thread.currentThread().getName() + " is using pen "+ this + " And Trying.  " + this);
        paper.FinishWriting();
    }

    public synchronized void FinishWriting(){
        System.out.println(Thread.currentThread().getName() + " Finished using pen "+ this  );
    }
}
class Pepar{
    public synchronized void writeWithPeparAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using pen "+ this + " And Trying.  " + this);
        pen.FinishWriting();
    }

    public synchronized void FinishWriting(){
        System.out.println(Thread.currentThread().getName() + " Finished using pen "+ this  );
    }
}
class Task1 implements Runnable{
    private Pen pen;
    private Pepar paper;

    Task1(Pen pen,Pepar paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPepar(paper);
                         // Thread1 lock pen to tries to lock paper
    }
}
class Task2 implements  Runnable{
    private Pen pen;
    private Pepar paper;

    Task2(Pen pen,Pepar paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen){
            paper.writeWithPeparAndPen(pen);            // resolve DeadLock
                                              // Thread2 lock pepar to tries to lock pen
        }
//        paper.writeWithPeparAndPen(pen);
    }
}

public class Deadlock1 {
    public static void main(String[] args) {

        Pen pen = new Pen();
        Pepar paper = new Pepar();

        Thread t1 = new Thread(new Task1(pen , paper),"Omkar");
        Thread t2 = new Thread(new Task2(pen,paper),"Gotya");

        t1.start();
        t2.start();
    }
}
