package Exception_handling.Try_catch;

public class exception1 {
    public static void main(String[] args) {
        int a = 10, b = 5, c;
        try {
            c = a/b;
            System.out.println("division : "+ c);
        }
        catch (ArithmeticException e){
            System.out.println("This is Arithametic exception");
        }
    }
}
