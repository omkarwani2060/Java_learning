package Exception_handling.Nested_catch;

public class syntax3 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException a){
            System.out.println(a);                  // this code execute.
            try{
                String str = null;
                System.out.println(str.toUpperCase());
            }
            catch(NullPointerException n){
                System.out.println(n);              // this code execute.
            }
        }
        System.out.println("Program Done..");           // print
    }
}
