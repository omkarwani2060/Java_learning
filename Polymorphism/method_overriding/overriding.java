package Polymorphism.method_overriding;

class A{
    void show(){
        System.out.println("This is super class");
    }
}
class B extends A{
    @Override               // this symbol to understand the override method.
    void show(){
       super.show();               // super class
        System.out.println("This is sub class.");    // sub class
    }
}
public class overriding {
    public static void main(String[] args) {
        A a1 = new B();
        a1.show();
    }
}
