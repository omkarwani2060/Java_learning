package Exception_handling.Nested_finally;

public class Syntax2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e);                           // this execute
        }
        finally{
            try{
                int[] arr = {10,20,30};
                System.out.println(arr[5]);
            }
            catch(Exception a){
                System.out.println(a);                       // this execute
            }
            finally{
                System.out.println("Array Exception");      // this execute
            }
        }
        System.out.println("Program terminate..");          // this execute
    }
}
