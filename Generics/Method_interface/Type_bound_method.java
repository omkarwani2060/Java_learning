package Generics.Method_interface;

class bound{
    static <T extends Number> Double method1(double num){       // type bound method
        return num * num;
    }
}
public class Type_bound_method {
    public static void main(String[] args) {
        System.out.println(bound.method1(5));
        System.out.println(bound.method1(3.0));
    }
}
