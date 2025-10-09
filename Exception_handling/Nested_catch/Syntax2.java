package Exception_handling.Nested_catch;

public class Syntax2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e);                      //this code execute
            try{
                int[] arr = {10,20,30};
                System.out.println(arr[1]);             //  this code execute
            }
            catch (ArrayIndexOutOfBoundsException a){
                System.out.println(a);
            }
        }
        System.out.println("Program Ok..");             // this code execute
    }
}
