package MultiThreading.Learn_Coding.By_Runnable;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException{

        a1 obj = new a1();
        Thread t1= new Thread(obj);
        t1.start();

        for(int i=1; i<5; i++){
            System.out.println("Main Thread..");
            Thread.sleep(500);
        }
    }
}
class a1 implements Runnable{
    @Override
    public void run() {
        try{
            for(int i=1; i<5; i++){
                System.out.println("Child Thread...");
                Thread.sleep(500);
            }
        }
        catch (InterruptedException i){
            System.out.println("Exception Handle");
        }
    }
}

