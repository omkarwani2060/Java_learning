package method;

public class spcf1 {

    void method2(){
        specifier obj = new specifier();
        System.out.println("within class but without package:  " + obj.str1);
    }
    public static void main(String[] args) {
    }
}

 class app2{
    void method3(){
        specifier obj = new specifier();
        System.out.println("outside class and outside package:  " + obj.str1);
    }
 }