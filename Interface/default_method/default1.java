package Interface.default_method;

interface A{
    void a1();
    void a2();
    default void a3(){                      // use the default access modifier
        System.out.println("May or not override in implementation class");
    }
}
class B implements A{
    public void a1(){
        System.out.println(" class A a1() ");
    }
    public void a2(){
        System.out.println(" class A a2() ");
    }
    public void a3(){                       // use the method a3 in class
        System.out.println("override in implementation  B class");
    }
}
class C implements A{
    public void a1(){
        System.out.println(" class C a1() ");
    }
    public void a2(){
        System.out.println(" class C a2() ");
    }
}
class D implements A{
    public void a1(){
        System.out.println(" class D a1() ");
    }
    public void a2(){
        System.out.println(" class D a2() ");
    }
}

public class default1{
    public static void main(String[] args) {
        B b1 = new B();
        b1.a1();   b1.a2();     b1.a3();

        C b2 = new C();
        b2.a1();   b2.a2();     b2.a3();

        D b3 = new D();
        b3.a1();   b3.a2();     b3.a3();
    }
}
