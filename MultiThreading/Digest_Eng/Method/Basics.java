package MultiThreading.Digest_Eng.Method;

public class Basics extends  Thread{
    @Override
    public void run() {                 //RUN METHOD
        for (int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);         //SLEEP METHOD
            }
            catch (InterruptedException a){
                System.out.println(a);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Basics t1 = new Basics();
        t1.start();                                 //START METHOD

        t1.join();                                      //JOIN  METHOD
        System.out.println("Hello Code Is Over...");

    }
}
