package MultiThreading.Digest_Eng.Thread_communication;

class SharedResource{
    private int data;
    private boolean hasDate;

    public synchronized void producer(int value)  {
        while(hasDate){
            try{
                wait();
                Thread.sleep(200);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasDate =true;
        System.out.println("Produced :"+ value);
        notify();

    }
    public synchronized int consumer(){
        while (!hasDate){
            try{
                wait();
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasDate = false;
        System.out.println("Consumer :"+ data);
        notify();
        return data;

    }
}
class Producer implements Runnable{

    private  SharedResource resource;

    public Producer(SharedResource resource){
        this.resource = resource;
    }
    @Override
    public void run() {
        for(int i=1;i<10; i++){
            resource.producer(i);
        }
    }
}

class Consumer implements Runnable{

    private SharedResource resource;

    public Consumer(SharedResource resource){
        this.resource = resource;
    }
    @Override
    public void run() {
        for(int i=1;i<10; i++){
            int value = resource.consumer();

        }
    }
}
public class Tcommunication {
    public static void main(String[] args) {
        SharedResource sh = new SharedResource();
        Thread t1 = new Thread(new Producer(sh));
        Thread t2 = new Thread(new Consumer(sh));

        t1.start();
        t2.start();

    }
}
