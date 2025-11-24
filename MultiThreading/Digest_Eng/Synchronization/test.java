package MultiThreading.Digest_Eng.Synchronization;

class counter {
    private static int count = 0;

    public synchronized void increase(){                // synchronized keyword
         count++;
//         synchronized (this){                     //synchronized block
//             count++;
//         }
    }
    public static int getCounter(){
        return  count;
    }
}
class mythread extends  Thread{
    private counter Counter;
    public mythread(counter Counter) {
        this.Counter = Counter;
    }
    @Override
    public void run() {
        for(int i = 0; i<1000; i++){
            Counter.increase();
        }
    }
}
public class test{
    public static void main(String[] args) {
        counter Counter1 =new counter();
        mythread t1 = new mythread(Counter1);
        mythread t2 = new mythread(Counter1);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println("Exception : "+ e);
        }
        System.out.println(counter.getCounter());
    }

}