package MultiThreading.Learn_Coding.By_Thread;

class t1 extends Thread{
    @Override
    public void run(){
        try{
            for (int i=0;i<=5; i++){
                System.out.println("Good Morning..");
               Thread.sleep(1000);
            }
        }
        catch (InterruptedException a){
            System.out.println(a);
        }
    }
}
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        t1 obj = new t1();
        obj.start();

        for(int i=0; i<=5; i++){
            System.out.println("Night..");
           Thread.sleep(1000);
        }
    }
}
