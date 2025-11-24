package MultiThreading.Digest_Eng.Method;

                        // setpriority method //

public class priority_m extends Thread{
    priority_m(String name ){               // Thread name Constructor create
        super(name);
    }
    public void run(){
        for(int i=1;i<=5;i++){
            String a = "";
            for(int j=1;j<=100000; j++ ){
                a += "a";
            }
            try{
                Thread.sleep(5);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " Priority : "
                    + Thread.currentThread().getPriority() + " Count : "+ i);
        }
    }
    public static void main(String[] args) {
        priority_m t1 = new priority_m("Omkar");
        priority_m t2 = new priority_m("Tatya");
        priority_m t3 = new priority_m("Babu");

            // Thread Priority :- which thread to run first

        t1.setPriority(Thread.MAX_PRIORITY);     //10       // priority high
        t2.setPriority(Thread.NORM_PRIORITY);    //5        // normal
        t3.setPriority(Thread.MIN_PRIORITY);     // 1       // low

        t1.start();
        t2.start();
        t3.start();



    }



}
