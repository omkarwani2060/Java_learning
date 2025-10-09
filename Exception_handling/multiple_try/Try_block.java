package Exception_handling.multiple_try;

public class Try_block {
    public static void main(String[] args) {
        try{
            int a = 10,b = 0,c;
            c = a/b;
            System.out.println(c);
        }catch(ArithmeticException A){
            System.out.println(A);
        }

        try{
            int[]  x = {10,20,30,40};
            System.out.println(x[5]);
        }catch(ArrayIndexOutOfBoundsException B){
            System.out.println(B);
        }

        try{
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("NUMBER : "+a);
        }catch(NumberFormatException C){
            System.out.println(C);
        }
    }
}
