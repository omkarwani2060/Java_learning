package Generics.Method_interface;

public class method1 <T>{                   // method of generics
    public void m1(T num){
        System.out.println("value :- "+ num);
    }
    public static void main(String[] args) {
        method1 <Integer> obj  = new method1<>();           // object
        obj.m1(89);

        method1 <String> obj2 = new method1<>();
        obj2.m1("Omkar");
    }
}
