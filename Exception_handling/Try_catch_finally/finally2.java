package Exception_handling.Try_catch_finally;

public class finally2 {
    static void finally_block(){
        try{                                    //this block are execute that catch block are other Exception
            int a= 10,b = 0,c;                  //that time catch block not execute after finally block execute.
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException x){
            int d= 10,e = 0,f;                  //that time catch block not execute after finally block execute.
            f = d/e;
            System.out.println(f);
            System.out.println(x);
        }
        finally {
            System.out.println("Program Ok");
        }
    }

    static void finally3(){
        try{                                    //this block are execute that catch block are other Exception
            int a= 10,b = 0,c;                  //that time catch block not execute after finally block execute.
            c = a/b;
            System.out.println(c);
        }
        catch(NumberFormatException x){
            System.out.println(x);
        }
        finally {
            System.out.println("Program Ok");
        }
    }
    public static void main(String[] args) {

       // finally_block();             //         this are try and catch code same code in same block.
        finally3();               // the catch block are other exeception are called that time not excute.


    }
}
