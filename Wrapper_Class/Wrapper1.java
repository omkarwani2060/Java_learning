package Wrapper_Class;

public class Wrapper1 {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = a;         // autoboxing :-> Primitive data to wrapper object
        System.out.println(a);

        Integer b = 100;
        int b1 = b;                 // unboxing
        System.out.println(b1);
    }
}
