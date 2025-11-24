package MultiThreading.Learn_Coding.Sleep_Join;

class new1 extends Thread{
    public void run(){
        for(int i=1; i<=3;i++){
            System.out.println(Thread.currentThread().getName()+ " - Running...");
            try{
                Thread.sleep(1000);     //sleep method run in waiting stat
            }
            catch(InterruptedException ingnore){

            }
        }
    }
}
public class Sleep {
    public static void main(String[] args) {

        new1 t1 = new new1();
        new1 t2 = new new1();

        t1.start();
        t2.start();
    }

}


