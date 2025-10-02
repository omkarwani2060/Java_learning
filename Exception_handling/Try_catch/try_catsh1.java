package Exception_handling.Try_catch;

public class try_catsh1 {
    public static void main(String[] args) {
        System.out.println("program started...");
        int a= 10, b=0, c;
        try{
            c = a/b;
            System.out.println("Ans :" + c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Program Ended...");
    }
}
