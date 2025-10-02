package Interface.Override;

class A{
    void m1(){
        System.out.println("Super class method.");
    }
}
class B extends A{
    @Override                               // override m1 method
    void m1(){
        System.out.println("Sub Class");
      //  super.m1();
    }
    void show(){
        System.out.println("only show");
    }
}
public class override1 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.m1();
        b1.show();
    }
}
