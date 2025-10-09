package Exception_handling.multiple_catch_block;

public class catch1 {
    public static void main(String[] args) {
        try {
            int a=10,b=1,c;
            c = a/b;
            System.out.println(c);

            int[] arr = {10,20,30,10};
            System.out.println(arr[2]);

            String str = null;
            System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException A){
            System.out.println("Array Exception");
        }
        catch(ArithmeticException B){
            System.out.println("Arithmetic exception");
        }
        catch (NumberFormatException C){
            System.out.println("NUmber Exception");
        }
//        catch (NullPointerException N)
//        {
//            System.out.println("NUll pointer Exception ");
//        }
        catch (Exception E){
            System.out.println("All the Exception..");
        }
    }
}
