package Exception_handling.Throw_Throws;

public class throws1 {
    public static void main(String[] args) throws InterruptedException{       // insert throws keyword
        for(int i=1; i<=10; i++){
            System.out.println(i);
            Thread.sleep(1000);     // automatically handle exception that main method caller JVM.
        }

    }
}
