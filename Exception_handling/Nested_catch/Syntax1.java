package Exception_handling.Nested_catch;

public class Syntax1 {
    public static void main(String[] args) {
        try{
            System.out.println(10/2);           // this block execute.
        }
        catch(Exception e){
            System.out.println(e);
            try{
                int[] arr = {10,20,30};
                System.out.println(arr[1]);
            }
            catch (ArrayIndexOutOfBoundsException a){
                System.out.println(a);
            }
        }
        System.out.println("Program terminate...");         // this block
    }
}
