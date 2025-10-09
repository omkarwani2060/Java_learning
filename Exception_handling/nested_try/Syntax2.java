package Exception_handling.nested_try;

public class Syntax2 {
    public static void main(String[] args) {
        try{
            try{
                String str = null;
                System.out.println(str.toUpperCase());
            }
            catch (NullPointerException n){
                System.out.println(n);                         // execute the block
            }
            int a=10, b = 2, c;
            c = a/b;
            System.out.println("Division : "+c);                // execute the block
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Done ...");
    }
}
