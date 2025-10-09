package Exception_handling.Throw_Throws;

class test{
   static void div(int a, int b) throws ArithmeticException{
        if(b == 0){
           throw new ArithmeticException();
        }
        else{
            int c = a/b;
            System.out.println(c);
        }
    }
}
public class Throw_Throws {
    public static void main(String[] args) {
        try{
            test.div(10,0);
        } catch (ArithmeticException a) {
            System.out.println("The value of b is Zero.");
        }
    }
}
