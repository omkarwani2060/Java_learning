package MultiThreading.Learn_Coding.By_Runnable;

public class By_interface implements Runnable{
    public void run() {
        try{
            for(int i=1; i<5; i++){
                System.out.println("Child Thread..");
                Thread.sleep(500);
            }
        }
        catch( InterruptedException i){
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws InterruptedException{

        By_interface bi = new By_interface();
        Thread t1 = new Thread(bi);
        t1.start();

        for (int i=0; i<5; i++){
            System.out.println("Main Thread");
            Thread.sleep(500);
        }
    }
}
