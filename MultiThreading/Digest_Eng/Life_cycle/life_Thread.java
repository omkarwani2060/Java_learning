package MultiThreading.Digest_Eng.Life_cycle;

public class life_Thread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");              //RUNNING
//        System.out.println(Thread.currentThread().getState());
        try{
            Thread.sleep(4000);
        }
        catch (InterruptedException i){
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        life_Thread lt = new life_Thread();     // NEW
        System.out.println(lt.getState());
        lt.start();                             //RUNNABLE
        System.out.println(lt.getState());

        Thread.sleep(200);
        System.out.println(lt.getState());      //Time -WAITING

        lt.join();
        System.out.println(lt.getState());          // TERMINATED

    }
}
