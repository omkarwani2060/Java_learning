package MultiThreading.Learn_Coding.By_Thread;
class out extends Thread{
    @Override
    public void run() {
        try{
            for (int i= 1; i<10; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException I){
            System.out.println(I);
        }
    }
}
public class Display {
    public static void main(String[] args) throws InterruptedException {

        out o1 = new out();
        o1.start();

        for (int i=1; i<=10; i++){
            System.out.println("Main Thread : "+ i);
            Thread.sleep(500);
        }
    }
}
