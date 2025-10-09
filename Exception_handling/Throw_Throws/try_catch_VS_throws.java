package Exception_handling.Throw_Throws;

public class try_catch_VS_throws {
    static void demo(int n) throws InterruptedException{
        for(int i=1; i<=n; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args)  {
     try{
         demo(10);
         System.out.println(10/0);
     }
     catch(Exception a){
         System.out.println("Exception Handled....");
     }
        System.out.println("Program terminate..");
    }
}
