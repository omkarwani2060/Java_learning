package Exception_handling.nested_try;

public class Syntax3 {
    public static void main(String[] args) {
        try{
            try{
                String str = "Omkar";
                int a = Integer.parseInt(str);
                System.out.println(a);
            }
            catch(NumberFormatException num){
                System.out.println(num);                   // catch block execute
            }
            int[] arr = {10,20,30,20};
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a);                             // catch execute block
        }
        System.out.println("DONE");
    }
}
