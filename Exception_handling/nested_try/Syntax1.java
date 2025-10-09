package Exception_handling.nested_try;

public class Syntax1 {
    public static void main(String[] args) {
        try{
            try{
                int a=10, b=1,c;
                c= a/b;
                System.out.println(c);              // execute the block
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
            int[] arr = {10,20,30};
            System.out.println(arr[2]);                // execute the block
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array Exception");
        }
        System.out.println("Done");
    }
}
