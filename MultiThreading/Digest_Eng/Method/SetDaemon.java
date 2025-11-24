package MultiThreading.Digest_Eng.Method;

public class SetDaemon extends Thread{
    public void run(){
        while(true){
            System.out.println("Hello World.");
        }
    }
    public static void main(String[] args) {
        SetDaemon s1 = new SetDaemon();

        s1.setDaemon(true);                         // Background Thread

        s1.start();
        System.out.println("OK Done .");
    }
}
