package Generics.Method_interface;

public class method2 {
    <T> void m2(T val){
        System.out.println("Value : "+ val);
    }
    public static void main(String[] args) {
        method2  obj = new method2();
        obj.m2(56);
        obj.m2("Omkar");
    }
}
