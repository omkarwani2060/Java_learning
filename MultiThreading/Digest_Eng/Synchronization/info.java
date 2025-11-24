package MultiThreading.Digest_Eng.Synchronization;

class Student{
    private int val=0;

    public synchronized void setVal(){
        val++;
    }
    public int getval(){
        return val;
    }
}
class thread1 extends Thread{
    private Student st;

    public thread1(Student st) {
        this.st = st;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            st.setVal();
        }
    }
}
public class info {
    public static void main(String[] args) {
        Student s1 = new Student();
        thread1 t1 = new thread1(s1);
        thread1 t2 = new thread1(s1);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e) {
            System.out.println("Exception... ");
        }

        System.out.println(s1.getval());

    }
}
