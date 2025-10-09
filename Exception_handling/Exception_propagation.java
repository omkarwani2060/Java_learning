package Exception_handling;

public class Exception_propagation {
    static void m1(){
        m2();
    }
    static void m2(){
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        try{
            m1();
        }
        catch (ArithmeticException a){
        //    System.out.println(" the Arithmetic Exception...");
            System.out.println(a);
        }
    }
}
