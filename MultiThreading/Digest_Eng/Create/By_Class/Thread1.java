package MultiThreading.Digest_Eng.Create.By_Class;

class world extends Thread{
                        //By Thread class //
    @Override
    public void run() {
        for(int i=1 ; i<10;i++){
            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class Thread1 {
    public static void main(String[] args) {

        world w1 = new world();
        w1.start();

        for(int i=1 ; i<10;i++){
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
