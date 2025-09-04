package method;
import method.spcf1.*;

public class specifier{
    public String str1 = "hello i am within class";
    void method1(){
        System.out.println("public class: " + str1);
    }
    public static void main(String[] args){
        specifier obj = new specifier();

        obj.method1();
        System.out.println("public class: " + obj.str1);

        app obj2 = new app();
        obj2.withoutclass();

        spcf1 obj3 = new spcf1();
        obj3.method2();

        app2 obj4 = new app2();
        obj4.method3();

    }
}

class app{
    void withoutclass(){
        specifier obj = new specifier();
        System.out.println("without class: " + obj.str1);
    }
}