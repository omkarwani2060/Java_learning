package MultiThreading.Digest_Eng.Executor_Framework;

public class Without_exc {
    public static void main(String[] args) {

        long StartTime = System.currentTimeMillis();
        Thread[] tthread = new Thread[9];
        for(int i=1; i<10; i++){
            int finalI = i;
            tthread[i-1] = new Thread( () -> {
               long result =  fact(finalI);
                System.out.println(result);
            });
            tthread[i-1].start();
        }

        for(Thread t: tthread){
            try{
                t.join();
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total Time :" + (System.currentTimeMillis() - StartTime));
    }
    public static long fact(int n){
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        int result = 1;
        int i=1;
        while(i<=n){
            result *= i;
            i++;
        }
        return result;
    }
}
