package Exception_handling.Try_catch_finally;

public class finally1 {
    public static void main(String[] args) {
        try{
            System.out.println("program started..");
            int a = 10,b = 0, c;
            c = a/b;
            System.out.println(c);
        }catch(ArithmeticException a){
            System.out.println(a);
        }finally {
            System.out.println("Success Fully Run Program.");
        }
    }
}
